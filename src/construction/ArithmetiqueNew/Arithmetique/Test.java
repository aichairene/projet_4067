package construction.ArithmetiqueNew.Arithmetique;


public class Test {
    public static  void main(String[] args){
        int som = Arithmetique.getInstance().somme(3, 5, 9);
        System.out.printf("la somme est %d" ,som);
        Arithmetique S1 = Arithmetique.getInstance(8, 3, 2);
        S1.affiche();

        Arithmetique S2 = Arithmetique.getInstance(5, 9,4);
        S2.affiche();
    }

}