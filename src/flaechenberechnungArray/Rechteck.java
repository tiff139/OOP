package flaechenberechnungArray;

public class Rechteck extends Form {
    //Attribute
int laenge, breite;

    //der parametisierte Konstruktor
    Rechteck(int laenge, int breite)
    {
        this.laenge = laenge;
        this.breite = breite;
    }


     @Override
    double berechneFlaeche() {

        {
            return laenge * breite;
        }
    }


}
