package Test;

import java.util.ArrayList;

public class Pro extends Planinar{
    /*
    Napraviti klasu Pro koji nasledjuje klasu Planinar koji iz svoje liste izbacuje samo planine
koje su vece od njegovog maxUspon-a.(override izbaci)
     */
    public Pro(int maxUspon, ArrayList<Planina> listaPlanina) {
        super(maxUspon, listaPlanina);
    }

    @Override
    public void izbaci() {
        for (int i=getListaPlanina().size()-1; i>=0; i--){
            if (getListaPlanina().get(i).getVisina()>getMaxUspon()){
                getListaPlanina().remove(i);
            }
        }
    }
}
