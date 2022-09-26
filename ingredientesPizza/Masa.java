package ingredientesPizza;

/**
 * Clase que implementa una clase para instanciar el tipo de masa de una pizza
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see IngredientesPizza
 */
public class Masa extends IngredientesPizza {

    /**
     * Constructor parametrizado que genera una instancia de un tipo de Masa específico segun una elección
     * @param eleccion 1-Gruesa 2-Delgada
     * @throws IllegalArgumentException En caso de recibir una eleccion que no listada anteriormente
     */
    public Masa(int eleccion){
        if(eleccion != 1 && eleccion != 2)
            throw new IllegalArgumentException();
        switch(eleccion){
            case 1:
                this.setNombre("Gruesa");
                this.setPrecio(15);
                break;
            case 2:
                this.setNombre("Delgada");
                this.setPrecio(10);
                break;
        }
    }
}
