package Test;

import java.util.ArrayList;

public class Planinar {
    /*
    Napraviti klasu Planinar
atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili jednaka max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara ili ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste
     */
    private ArrayList<Planina> listaPlanina;
    private int maxUspon;

    public Planinar(int maxUspon, ArrayList<Planina> listaPlanina){
        this.maxUspon=maxUspon;
        this.listaPlanina=listaPlanina;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(int maxUspon) {
        this.maxUspon = maxUspon;
    }

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public void dodaj(Planina p){
        if (p.getVisina()<=getMaxUspon()){
                getListaPlanina().add(p);
                System.out.println(p.getNaziv()+" je dodata u listu.");
        } else {
            System.out.println(p.getNaziv()+" nije dodata u listu.");
        }
    }

    public ArrayList<Planina> opasne(){
        ArrayList<Planina> opasne=new ArrayList<>();
        for (Planina p:getListaPlanina()){
            if (p.isOpasnost()){
                opasne.add(p);
            }
        }
        if (opasne.isEmpty()){
            System.out.println("Nema opasnih planina.");
        }
        return opasne;
    }

    public void izbaci(){
        for (int i=getListaPlanina().size()-1; i>=0; i--){
            if ((getListaPlanina().get(i).getVisina()>getMaxUspon()) || getListaPlanina().get(i).isOpasnost()){
                getListaPlanina().remove(i);
            }
        }
    }

    public void najveca(){
        Planina najP=getListaPlanina().get(0);
        for (Planina p:getListaPlanina()){
            if (p.getVisina()>najP.getVisina()){
                najP=p;
            }
        }
        System.out.println("Najveća planina iz liste je "+najP);
    }

    public String toString(){
        return listaPlanina+" "+maxUspon;
    }
}
