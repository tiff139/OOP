package interfaces.beispiel1;

public class Main {
    public static void main(String[] args) {

        Schwimmfähigkeit[] gruppe = {new Ente(), new Fisch(), new Uboot()};

        for (Schwimmfähigkeit s : gruppe) {
            s.schwimmen(); //polymorpher Aufruf
        }

    }
}


