package Modele;

import java.io.IOException;

public class Batiment {
    private static int nbBatiment =0;
    protected int besoinCBois;
    protected int besoinCPierre;
    protected int besoinCCeramique;
    protected String imageName;

    public Batiment(int cBois, int cPierre, int cCeramique, String imageName) {
        this.besoinCBois = cBois;
        this.besoinCPierre = cPierre;
        this.besoinCCeramique = cCeramique;
        this.imageName = imageName;        
        setNbBatiment();
    }
    
    public Batiment(int cBois, int cPierre, int cCeramique) {
        this.besoinCBois = cBois;
        this.besoinCPierre = cPierre;
        this.besoinCCeramique = cCeramique;
        this.imageName = "End.jpg";        
        setNbBatiment();
    }

    public static int getNbBatiment() {
        return nbBatiment;
    }
    public static void setNbBatiment() {
        Batiment.nbBatiment++;
    }

    public int getcBois() {
        return besoinCBois;
    }
    public void setcBois(int cBois) {
        this.besoinCBois = cBois;
    }
    
    public int getcPierre() {
        return besoinCPierre;
    }
    public void setcPierre(int cPierre) {
        this.besoinCPierre = cPierre;
    }

    public int getcCeramique() {
        return besoinCCeramique;
    }
    public void setcCeramique(int cCeramique) {
        this.besoinCCeramique = cCeramique;
    }

    public String getPathImage() throws IOException {
    	String currentpath=new java.io.File(".").getCanonicalPath();
    	return currentpath +"\\image\\batiment\\" +imageName;
    }
    


}
