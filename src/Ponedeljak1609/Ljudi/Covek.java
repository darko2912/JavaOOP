package Ponedeljak1609.Ljudi;

public class Covek {

        String ime;
        String prezime;
        int jmbg;
        int godinaRodjenja;

        public Covek(String ime, String prezime, int jmbg, int godinaRodjenja) {
            this.ime=ime;
            this.prezime=prezime;
            this.jmbg=jmbg;
            this.godinaRodjenja=godinaRodjenja;
        }

        public String toString(){
            return  ime + " " + prezime + " " + jmbg + " " + godinaRodjenja;
        }

        public int godine() {
            return 2024-godinaRodjenja;
        }

        public void pozdraviSe() {
            System.out.println("Zdravo, moje ime je "+ime);
        }
}
