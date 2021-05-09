package Modele;

import java.io.File;

public class Compagnon extends Ouvrier{
    private static int nbTTcompetence = 4;
    private static File fichierImage = new File("../../image/icompagnon.png");


    public Compagnon(int cBois, int cPierre, int cCeramique){
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

    public static File getFichierImage() {
        return fichierImage;
    }

}
