package ingredientesPizza;

/**
 * Clase que implementa una clase para instanciar el ingrediente de tipo queso de una pizza
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see IngredientesPizza
 */
public class Queso extends IngredientesPizza {

    /**
     * Constructor parametrizado que genera una instancia de un tipo de queso específico segun una elección
     * @param eleccion 1-Cheddar 2-Manchego
     * @throws IllegalArgumentException En caso de recibir una eleccion que no listada anteriormente
     */
    public Queso(int eleccion){
        if(eleccion != 1 && eleccion != 2)
            throw new IllegalArgumentException();
        switch(eleccion){
            case 1:
                this.setNombre("Cheddar");
                this.setPrecio(20);
                break;
            case 2:
                this.setNombre("Manchego");
                this.setPrecio(15);
                break;
        }
    }
}
