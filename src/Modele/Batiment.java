package Modele;

public class Batiment {
    private static int nbBatiment =0;
    protected int besoinCBois;
    protected int besoinCPierre;
    protected int besoinCCeramique;
    private boolean chantierEnd; //status du chantier




    public Batiment(int cBois, int cPierre, int cCeramique) {
        this.besoinCBois = cBois;
        this.besoinCPierre = cPierre;
        this.besoinCCeramique = cCeramique;
        this.chantierEnd = false;
        setNbBatiment();
    }
    public Batiment(int cBois, int cPierre, int cCeramique, boolean chantierEnd) {
        this.besoinCBois = cBois;
        this.besoinCPierre = cPierre;
        this.besoinCCeramique = cCeramique;
        this.chantierEnd = chantierEnd;
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

    public boolean isChantierEnd() {
        return chantierEnd;
    }
    public void ChantierIsEnd() {
        this.chantierEnd = true;
    }


}
