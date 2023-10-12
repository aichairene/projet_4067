package factory_MethodeNew.factory_Methode;

public class client {
    public static  void main(String[] args){
        ProduitFactory produitFactory = new ProduitFactory();

        ProduitA produitA;

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
        produitA.methodeA();


    }
}
