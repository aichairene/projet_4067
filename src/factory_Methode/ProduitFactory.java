package factory_Methode;

public class ProduitFactory {
    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;

    public ProduitA getProduitA(int typeProduit){
        ProduitA produitA;

        switch (typeProduit){
            case TYPE_PRODUITA1:
            produitA = new ProduitA1();
            break;

            case TYPE_PRODUITA2:
                produitA = new ProduitA2();
                break;

            default:
                throw  new IllegalArgumentException("type de produit inconnu");
        }
        return produitA;
    }
}
