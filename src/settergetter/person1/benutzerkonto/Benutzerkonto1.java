package settergetter.person1.benutzerkonto;

public class Benutzerkonto1 {
    private String benutzername;
    private String passwort;


    public void setPasswort(String passwort) {
        if (passwort.length() < 8) {
            System.out.println("Passwort muss mindestens 8 Zeichen lang sein.");
        }
        else
        {
            this.passwort = passwort;
        }

    }
}
