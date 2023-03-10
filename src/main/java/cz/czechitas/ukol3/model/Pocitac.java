package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor procesor;
    private Pamet pamet;
    private Disk disk;

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public Pamet getPamet() {
        return pamet;
    }

    public void setPamet(Pamet pamet) {
        this.pamet = pamet;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }


    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (!jeZapnuty) {
            overStavKomponentASpustSe();
        } else {
            System.err.println("Počítač již je zapnutý");

        }
    }
        private void overStavKomponentASpustSe() {

            if (disk != null && pamet != null && procesor != null) {
                jeZapnuty = true;
                System.out.println("Počítač se zapnul!");
            } else {
                System.err.println("Chybí komponenta");
                nahlasChybejiciKomponenty();
            }
        }

        private void nahlasChybejiciKomponenty() {
            if (disk == null) {
                System.err.println("Chybí disk!");
            }
            if (pamet == null) {
                System.err.println("Chybí paměť!");
            }
            if (procesor == null) {
                System.err.println("Chybí procesor!");
            }
        }
    public void vypniSe() {
        if (jeZapnuty()) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul!");
        }

    }
    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            long vyuziteMisto = disk.getVyuziteMisto();
            long kapacita = disk.getKapacita();
            long zbyvajiciMisto=kapacita-vyuziteMisto-velikost;
            if ((vyuziteMisto + velikost) > kapacita) {
                System.err.println("Kapacita disku nedostacuje.");
            } else {
                disk.setVyuziteMisto(vyuziteMisto + velikost);
                System.out.println("Zbývající místo na disku: " + (zbyvajiciMisto));
            }

        } else {
            System.err.println("Pc je vypnutý");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            long vyuziteMisto = disk.getVyuziteMisto();
            long kapacita = disk.getKapacita();
            long zbyvajiciMisto=kapacita-vyuziteMisto+velikost;
            if (velikost < vyuziteMisto) {
                disk.setVyuziteMisto(vyuziteMisto + velikost);
            } else {
                disk.setVyuziteMisto(0);
            }

            System.out.println("Zbývající místo na disku: " + (zbyvajiciMisto));
        } else {
            System.err.println("Pc je vypnutý");
        }
    }




    @Override
        public String toString () {
        return "Počítač:" + procesor + pamet + disk;
        }
    }

