package Petak2009.Zadatak1;

public class Main {
    public static void main(String[] args) {
        Doktor d=new Pedijatar("Darko", 10,1995);
        Doktor d2=new Hirurg("Marko", 5,1990);
        Doktor d3=new Oftalmolog("Žarko", 3,1980);

        System.out.println("Plata pedijatra je: "+d.plata()+", plata hirurga je "+d2.plata()+", plata oftalmologa je "+d3.plata());
    }
}
