package Modele;

import java.util.ArrayList;

public class Chantier extends Batiment{

    private ArrayList<Ouvrier> ListOuvrier=new ArrayList<Ouvrier>();

    public Chantier(int cBois, int cPierre, int cCeramique) {
        super(cBois, cPierre, cCeramique);
    }
    

    public int getTotalBoisDispo(){
        int nbRessource = 0;
        for(int i=0; i<ListOuvrier.size();i++){
            nbRessource += ListOuvrier.get(i).getcBois();
        }
        return nbRessource;
    }

    public int getTotalPierreDispo(){
        int nbRessource = 0;
        for(int i=0; i<ListOuvrier.size();i++){
            nbRessource += ListOuvrier.get(i).getcPierre();
        }
        return nbRessource;
    }

    public int getTotalCeramiqueDispo(){
        int nbRessource = 0;
        for(int i=0; i<ListOuvrier.size();i++){
            nbRessource += ListOuvrier.get(i).getcCeramique();
        }
        return nbRessource;
    }

    public void addOuvrier(Ouvrier ouvrier){
        ListOuvrier.add(ouvrier);
    }

    public boolean isBatimentEnd(){
        return ((getTotalBoisDispo()>= this.besoinCBois)&&(getTotalPierreDispo()>= this.besoinCPierre)&&(getTotalCeramiqueDispo()>= this.besoinCCeramique));
    }


}
