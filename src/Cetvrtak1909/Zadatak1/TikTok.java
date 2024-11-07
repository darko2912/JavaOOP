package Cetvrtak1909.Zadatak1;

public class TikTok extends DrustvenaMreza{
    public TikTok(int brojKorisnika, int brojReklama) {
        super(brojKorisnika, brojReklama);
    }

    @Override
    public void upozorenje() {
        if (getBrojKorisnika()<500){
            System.out.println("Društvena mreža nema dovoljno korisnika.");
        } else {
            System.out.println("Društvena mreža ima dovoljno korisnika.");
        }
    }
}
