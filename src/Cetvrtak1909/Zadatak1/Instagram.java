package Cetvrtak1909.Zadatak1;

public class Instagram extends DrustvenaMreza{
    public Instagram(int brojKorisnika, int brojReklama) {
        super(brojKorisnika, brojReklama);
    }

    @Override
    public double zarada() {
        return getBrojKorisnika()+(getBrojReklama()*10);
    }
}
