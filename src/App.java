import Modele.*;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Ouvrier jo = new Ouvrier(1, 6, 1);
        // System.out.println(jo.getNbOuvrier());

        // Ouvrier po = new Ouvrier(1, 2, 3); 
        // Ouvrier gogo = new Ouvrier(6, 6, 6);

        // System.out.println(po.getNbOuvrier());
        // System.out.println(gogo.getcBois()+", "+gogo.getcCeramique()+", "+gogo.getcPierre());
        // System.out.println(Ouvrier.getNbOuvrier());

        Apprenti lui = new Apprenti(0, 1, 1);
        System.out.println("Apprentie flo :");
        System.out.println("Bois : "+lui.getcBois());
        System.out.println("Pierre : "+lui.getcPierre());
        System.out.println("Ceramique : "+lui.getcCeramique());


        Maitre flo = new Maitre(0, 1, 1);
        System.out.println("Apprentie flo :");
        System.out.println("Bois : "+flo.getcBois());
        System.out.println("Pierre : "+flo.getcPierre());
        System.out.println("Ceramique : "+flo.getcCeramique());

    }
}
