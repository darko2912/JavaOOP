package Ponedeljak2309.Zadatak2;

public class OnlineKorpa  extends Korpa{
    public OnlineKorpa(Stavka stavka, KreditnaKartica kk) {
        super(stavka, kk);
    }

    @Override
    public void plati() {
        double popust=getStavka().getCena()*0.90;
        if (popust<=getKk().getStanjeNaRacunu()){
            getKk().setStanjeNaRacunu(getKk().getStanjeNaRacunu()-popust);
            System.out.println("Uspešno kupljen proizvod.");
            System.out.println("Trenutno stanje: "+getKk().getStanjeNaRacunu());
        } else {
            System.out.println("Nemate dovoljno sredstava na računu.");
        }
    }
}
