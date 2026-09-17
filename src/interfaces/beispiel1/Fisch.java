package interfaces.beispiel1;

public class Fisch implements Schwimmfähigkeit{
    @Override
    public void schwimmen() {
        System.out.println("Der Fisch kann schwimmen");
    }
}
