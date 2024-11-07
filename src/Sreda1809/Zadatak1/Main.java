package Sreda1809.Zadatak1;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto("Golf", 200, 10000, "crna");
        System.out.println(a.getCena());
        a.setCena(9000);
        System.out.println(a.getCena());
    }
}
