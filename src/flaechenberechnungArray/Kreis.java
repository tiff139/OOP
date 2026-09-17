package flaechenberechnungArray;

public class Kreis extends Form {
    //Attribute
    double radius;


    public Kreis(double radius)
    {
        this.radius = radius;
    }
@Override
    double berechneFlaeche()
    {
         {
            return Math.PI * radius * radius;
        }

    }
}
