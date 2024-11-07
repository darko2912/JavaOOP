package Cetvrtak1909.Domaci;

public class Main {
    public static void main(String[] args) {
        Dolar d=new Dolar( 0);
        Euro e=new Euro( 0);
        System.out.println(d);
        System.out.println(e);
        d.postaviNoviKurs(105);
        e.postaviNoviKurs(120);
        System.out.println("Dolar u dinarima sa novim kursom: "+d.konvertujUDinare(100));
        System.out.println("Euro u dinarima sa novim kursom: "+e.konvertujUDinare(100));

        double dolarUEure=d.konvertujUDinare(100)/e.getKurs();
        double euroUDolare=e.konvertujUDinare(100)/d.getKurs();
        System.out.println("100 dolara je "+dolarUEure+" eura");
        System.out.println("100 eura je "+euroUDolare+" dolara");
    }
}
