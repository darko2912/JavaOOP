package Ponedeljak1609.Zadatak2;

import java.util.ArrayList;

public class Student {
    /*
    Napraviti klasu Student koji ima od atributa ime i listu ocena.
Napraviti metodu koja racuna studentov prosek.
Napraviti metodu koja proverava prosek I ukoliko je manji od 1.5 ispisati poruku da mora na popravni.
Klasa mora imati adekvatan konstruktor I toString.
     */
    String ime;

    ArrayList<Integer> ocene;

    public Student (String ime, ArrayList<Integer> ocene) {
        this.ime=ime;
        this.ocene=ocene;
    }

    public double prosek () {
        double suma = 0;
        for (int i=0; i<ocene.size(); i++){
            suma += ocene.get(i);
        }
        return suma/ocene.size();
    }

    public void popravni () {
        if (prosek()<1.5){
            System.out.println("Student je pao na popravni.");
        } else {
            System.out.println("Student je prošao godinu.");
        }
    }

    public String toString () {
        return ime+" "+ocene;
    }

}
