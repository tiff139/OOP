package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionII
{
    public static void dateiEinlesen() throws IOException
    {
        //Inhalt einer Datei einlesen
        FileReader reader = new FileReader("C:\\text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        //Ressourcen wieder freigeben
        reader.close();
        bufferedReader.close();
    }

    public static void main(String[] args)   //Das wäre hier die aufrufende Methode (der Methode dateiEinlesen())
    {
        try
        {
            dateiEinlesen();
        }
        catch(IOException e)
        {
            System.err.println(e.getMessage());
        }

        System.out.println("Das Hauptprogramm geht hier weiter");
    }
}
