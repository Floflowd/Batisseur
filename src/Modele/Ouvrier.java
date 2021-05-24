package Modele;

import java.io.IOException;

public class Ouvrier {
    private static int nbOuvrier =0;
    protected int cBois;
    protected int cPierre;
    protected int cCeramique;
    



    public Ouvrier(int cBois, int cPierre, int cCeramique) {
        if(ChekNbCompetence(cBois)){
            this.cBois = cBois;
        }
        else{
            this.cBois = 5;
        }
        if(ChekNbCompetence(cPierre)){
            this.cPierre = cPierre;
        }
        else{
            this.cPierre = 5;
        }
        if(ChekNbCompetence(cCeramique)){
            this.cCeramique = cCeramique;
        }
        else{
            this.cCeramique = 5;
        }

        setNbOuvrier();
        
    }


    public static int getNbOuvrier() {
        return nbOuvrier;
    }
    public static void setNbOuvrier() {
        Ouvrier.nbOuvrier++;
    }

    public int getcBois() {
        return cBois;
    }
    public void setcBois(int cBois) {
        this.cBois = cBois;
    }
    
    public int getcPierre() {
        return cPierre;
    }
    public void setcPierre(int cPierre) {
        this.cPierre = cPierre;
    }

    public int getcCeramique() {
        return cCeramique;
    }
    public void setcCeramique(int cCeramique) {
        this.cCeramique = cCeramique;
    }
    
    protected int ReadNbCTotal(int cBois, int cPierre, int cCeramique){
        return cBois+cPierre+cCeramique;
    }
    protected boolean ChekNbCTotal(int cBois, int cPierre, int cCeramique, int Nbmax){
        if(ReadNbCTotal(cBois, cPierre, cCeramique) == Nbmax){
            return true;
        }
        return false;
    }

    protected boolean ChekNbCompetence(int competence){
        if(competence <= 5){
            return true;
        }
        return false;
    }

    public String getPathImage() throws IOException {
    	String currentpath=new java.io.File(".").getCanonicalPath();
    	return currentpath + "\\image\\end.jpg";
    }
    
    
    public String toString() {
    	return "Ouvrier, cBois = "+ this.getcBois() + ", cPierre = " +this.getcPierre() + ", cCeramique = " +this.getcCeramique();
    }
}
