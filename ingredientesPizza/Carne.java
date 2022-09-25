package ingredientesPizza;

/**
 * Clase que implementa una clase para instanciar el ingrediente de tipo carne de una pizza
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see IngredientesPizza
 */
public class Carne extends IngredientesPizza {

    /**
     * Constructor parametrizado que genera una instancia de un tipo de carne específico segun una elección
     * @param eleccion 1-Salchicha 2-Jamon 3-Pollo
     * @throws IllegalArgumentException En caso de recibir una eleccion que no listada anteriormente
     */
    public Carne(int eleccion){
        if(eleccion != 1 && eleccion != 2 && eleccion != 3)
            throw new IllegalArgumentException();
        switch(eleccion){
            case 1:
                this.setNombre("Salchicha");
                this.setPrecio(20);
                break;
            case 2:
                this.setNombre("Jamon");
                this.setPrecio(15);
                break;
            case 3:
                this.setNombre("Pollo");
                this.setPrecio(20);
                break;
        }
    }
}
