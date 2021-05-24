package Modele;

import java.io.IOException;

public class Apprenti extends Ouvrier{
    private static int nbTTcompetence = 2;

	
    public Apprenti(int cBois, int cPierre, int cCeramique){
        super(cBois, cPierre, cCeramique);
        while(!ChekNbCTotal(this.cBois, this.cPierre, this.cCeramique, nbTTcompetence)){
            // retire un point de compétence de manière random
            int alea = (int)(Math.random() * 3) ;
            if(alea == 0 &&  this.cBois>0){
                this.cBois--;
            }
            if(alea == 1 &&  this.cPierre>0){
                this.cPierre--;
            }
            if(alea == 2 &&  this.cCeramique>0){
                this.cCeramique--;
            }
        }
    }

    /*public static String getPathImage() {
        return currentpath + "\\image\\iapprenti.png";
    }*/
    
    public String getPathImage() throws IOException {
    	String currentpath=new java.io.File(".").getCanonicalPath();
    	return currentpath + "\\image\\iapprenti.png";
    }
    
    public String toString() {
    	return "Apprenti, cBois = "+ this.getcBois() + ", cPierre = " +this.getcPierre() + ", cCeramique = " +this.getcCeramique();
    }

}
