package Ponedeljak1609.Ljudi;

import java.util.Scanner;

public class Objekti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi ime: ");
        String ime = sc.nextLine();

        Covek c = new Covek(ime, "Ocel", 123546, 1995);
        Covek c1 = new Covek("Dragana", "Medić", 1235468, 1998);

        System.out.println("Moje ime je "+c.ime+", a prezime " +c.prezime);
        System.out.println(c);
        c.pozdraviSe();
        System.out.println("Moje ime je "+c1.ime+", a prezime " +c1.prezime);
    }
}
