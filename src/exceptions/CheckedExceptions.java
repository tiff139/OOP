package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions //muss behandelt oder mit "throws" deklariert werden/an die aufrufende Methode weitergegeben werden
{
    public static void main(String[] args)
    {
        //Inhalt einer Datei einlesen

        //Alternative:  ------- try-with-resources -------

        try(FileReader filereader = new FileReader("C:\\Users\\hp\\Desktop\\text.txt"))
        {
            BufferedReader bufferedReader = new BufferedReader(filereader);
            //Inhalt einer Datei Zeile für Zeile einlesen
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());

            //filereader.close();   //Das wäre bei try-with-resoursec redundant/überflüssig
            bufferedReader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error Class: " + e.getClass().getSimpleName());  //FileNotFoundException extends IOException
            System.err.println("Error Message: " + e.getMessage());
        }

        System.out.println("Hier läuft das Programm weiter...");
    }
}
