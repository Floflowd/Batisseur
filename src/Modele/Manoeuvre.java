package Modele;

import java.io.File;
import java.io.IOException;

public class Manoeuvre extends Ouvrier{
    private static int nbTTcompetence = 3;
    private static File fichierImage = new File("../../image/imanoevre.png");


    public Manoeuvre(int cBois, int cPierre, int cCeramique){
        super(cBois, cPierre, cCeramique);
        while(!ChekNbCTotal(this.cBois, this.cPierre, this.cCeramique, nbTTcompetence)){
            // retire un point de compétence de manière random
            int alea = (int)(Math.random() * 3) ;
            if(ReadNbCTotal(this.cBois, this.cPierre, this.cCeramique)>nbTTcompetence){
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
            else{
                if(alea == 0 &&  this.cBois<5){
                    this.cBois++;
                }
                if(alea == 1 &&  this.cPierre<5){
                    this.cPierre++;
                }
                if(alea == 2 &&  this.cCeramique<5){
                    this.cCeramique++;
                }
            }                
        }
    }

    public String getPathImage() throws IOException {
    	String currentpath=new java.io.File(".").getCanonicalPath();
    	return currentpath + "\\image\\imanoeuvre.png";
    }
    

    public String toString() {
    	return "Manoeuvre, cBois = "+ this.getcBois() + ", cPierre = " +this.getcPierre() + ", cCeramique = " +this.getcCeramique();
    }
}
