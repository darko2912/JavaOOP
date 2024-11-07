package Cetvrtak1909.Zadatak3;

public class Main {
    public static void main(String[] args) {
        /*
        Implementirati klasu Osoba koja ima ime, prezime, god rodjenja i metodu za predstavljanje,
        zatim kreirati klasu Student koja nasledjuje klasu Osoba i dodaje svoje specificne atribute,
        poput liste predmeta, broja indeksa i proseka ocena. Klasa Student dodaje i metodu za dodavanja predmeta,
        prikaza proseka i overide-uje metodu koja vraca opis, cineci je prilagodjenom za studente. Takodje,
        dodati metodu koja ispisPredmeta(), koja ispisuje sve predmete koje student slusa.
Lista predmeta sadrzi elemente tipa Predmet. Klasa Predmet sadrzi ime predmeta, broj ESPB-a i ime profesora i
metod koji vraca opis predmeta.
U main-u kreirati studenta i pozvati metode koje su implementirane
         */
        Predmet p1=new Predmet("Matematika",8,"Dejan");
        Predmet p2=new Predmet("Programiranje",10,"Marko");
        Predmet p3=new Predmet("Baze podataka",6,"Dragoljub");

        Student student=new Student("Darko","Ocel",1995,"60/2015",9.36);
        student.dodajPredmet(p1);
        student.dodajPredmet(p2);
        student.dodajPredmet(p3);
        student.predsaviSe();
        student.prosekOcena();
        student.ispisPredmeta();
    }
}
