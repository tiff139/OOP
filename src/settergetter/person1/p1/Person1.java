package settergetter.person1.p1;

public class Person1 {

    private String name;
    private int alter;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {

        if (alter < 0) {
            System.out.println("you are not living backwards");
        } else {
            this.alter = alter;
        }
    }

}
