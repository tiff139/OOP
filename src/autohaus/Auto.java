package autohaus;

public class Auto {
    //Attribute
    String farbe;   //Instanzattribut
    int geschwindigkeit;    //Instanzattribut
    static int reifen;    //Klassenattribut  static

    //Methoden
    public void beschleunigen() {
        geschwindigkeit += 10;
    }

    public void bremsen(int b) {
        geschwindigkeit -= b;
    }

    public static void zaehlen() {
        reifen++;
    }

}
