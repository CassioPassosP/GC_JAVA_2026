import classes.Cat;
import classes.EspadaDePedra;

public class main {
    public static void main(String[] args) {

        EspadaDePedra espada = new EspadaDePedra();

        System.out.println(espada);

        String catName1 = "catmine";
        String catColor1 = "Preto";
        int catAge1 = 6;
        Cat cat1 = new Cat(catAge1,catColor1,catName1);

        System.out.println(cat1);

    }
}
