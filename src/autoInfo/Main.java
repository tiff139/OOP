package autoInfo;

public class Main {
    public static void main(String[] args) {


        Auto auto1 = new Auto();

        auto1.marke = "Vw";
        auto1.modell = "Golf";
        auto1.farbe = "blau";
        auto1.baujahr = 2020;

        Auto auto2 = new Auto();

        auto2.marke = "BMW";
        auto2.modell = "X3";
        auto2.farbe = "schwarz";
        auto2.baujahr = 2023;

        System.out.println(auto1.zeigeInfo());;


    }
}
