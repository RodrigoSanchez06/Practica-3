import pizza.Boneless;
import pizza.Pizza;

public class MainTest {

    public static void main(String args[]) {
        Pizza primera = new Boneless();
        System.out.println(primera.getNombre() + "\n**Descripcion** \n" + primera.getDescripcion());
    }
}
