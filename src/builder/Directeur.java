package builder;
public class Directeur {
    MonteurPizza monteurPizzaReine =  new MonteurPizzaReine();
    MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();

    public void construire(){
        monteurPizzaReine.creerNouvellePizza();
        monteurPizzaReine.monterPate();
        monteurPizzaReine.monterSauce();
        monteurPizzaReine.monterGarniture();


        monteurPizzaPiquante.creerNouvellePizza();
        monteurPizzaPiquante.monterPate();
        monteurPizzaPiquante.monterSauce();
        monteurPizzaPiquante.monterGarniture();
    }

}
