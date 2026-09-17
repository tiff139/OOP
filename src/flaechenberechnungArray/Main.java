package flaechenberechnungArray;

public class Main {
    public static void main(String[] args) {


//        Form[] formen = {new Rechteck(5,6), new Kreis(4)};
//
//        for(Form x : formen)

        Rechteck r = new Rechteck(5, 4);
        Kreis k = new Kreis(3);
        Form[] geoForm = {r, k};
        {
            for (Form x : geoForm) {
                System.out.println(x.getClass().getSimpleName());
                System.out.println(x.berechneFlaeche());

            }
        }
    }
}
