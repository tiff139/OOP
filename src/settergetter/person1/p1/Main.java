package settergetter.person1.p1;

public class Main {
    public static void main(String[] args) {


        Person1 p = new Person1();
        p.setName("Tiffany");
        p.setAlter(-37);

        System.out.println(p.getName() + " ist " + p.getAlter() + " Jahre alt ");
    }
}
