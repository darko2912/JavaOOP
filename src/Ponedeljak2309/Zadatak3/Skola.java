package Ponedeljak2309.Zadatak3;

import java.util.ArrayList;

public class Skola {

    ArrayList<Ucenik> listaUcenika;

    public Skola (ArrayList<Ucenik> listaUcenika){
        this.listaUcenika=listaUcenika;
    }
    public ArrayList<Ucenik> getListaUcenika(){
        return listaUcenika;
    }
    public void setListaUcenika(ArrayList<Ucenik> novaLista){
        this.listaUcenika=novaLista;
    }

    public ArrayList<Ucenik> vukovci(){
        ArrayList<Ucenik> listaVukovaca=new ArrayList<>();
        for (Ucenik u:getListaUcenika()){
            if (u.prosek()==5.0){
                listaVukovaca.add(u);
            }
        }
        return listaVukovaca;
    }

    public void izbaci(){
        ArrayList<Ucenik> lista=new ArrayList<>();
        for (Ucenik u:getListaUcenika()){
            if (!(u.prosek()<1.5)){
                lista.add(u);
            }
        }
        setListaUcenika(lista);
    }

    public int neopravdani(){
        int sum=0;
        for (Ucenik u:getListaUcenika()){
            sum+=u.getBrojNeopravdaniv();
        }
        return sum;
    }

    public String toString(){
        return listaUcenika+" ";
    }
}
