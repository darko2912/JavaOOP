package Ponedeljak1609.Zadatak2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Napraviti klasu Student koji ima od atributa ime i listu ocena.
Napraviti metodu koja racuna studentov prosek.
Napraviti metodu koja proverava prosek I ukoliko je manji od 1.5 ispisati poruku da mora na popravni.
Klasa mora imati adekvatan konstruktor I toString.
         */
        ArrayList<Integer> ocene = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite Vaše ocene od 1 do 5: ");
        for (int i=0; i<5; i++) {
            int ocena = sc.nextInt();
            ocene.add(ocena);
        }

        Student s = new Student("Darko", ocene);
        System.out.println(s);
        System.out.println("Prosek ocena je: "+ s.prosek());
        s.popravni();
    }
}
