package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac NastinPocitac;
        NastinPocitac = new Pocitac();
        System.out.println(NastinPocitac.toString());//Vypise chybu, protoze pocitac nema vsechny povinne soucasti
        NastinPocitac.zapniSe();

        Procesor NastinProcesor = new Procesor();
        NastinProcesor.setRychlost(2_400_000_000_000L);
        NastinProcesor.setVyrobce("Intel");

        Pamet NastinaPamet = new Pamet();
        NastinaPamet.setKapacita(8_000_000_000L);

        Disk NastinDisk = new Disk();
        NastinDisk.setKapacita(476_000_000_000L);

        NastinPocitac.setProcesor(NastinProcesor);
        NastinPocitac.setPamet(NastinaPamet);
        NastinPocitac.setDisk(NastinDisk);

        System.out.println(NastinPocitac.toString());

        NastinPocitac.zapniSe();
        NastinPocitac.zapniSe();

        System.out.println(NastinPocitac.toString());
        NastinPocitac.vypniSe();

        NastinPocitac.vypniSe();
        NastinPocitac.vypniSe();

        NastinPocitac.zapniSe();
        NastinPocitac.jeZapnuty();
        NastinPocitac.vytvorSouborOVelikosti(120_000_000_000L);
        NastinPocitac.vymazSouboryOVelikosti(140_000_000_000L);








    }

}

