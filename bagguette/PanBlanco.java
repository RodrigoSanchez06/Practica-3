package bagguette;

/**
 * Clase chiclocentro que hereda de bagguette y 
 * representa a una bagguette con Pan Blancno.
 */
public class PanBlanco extends Bagguette{

    /**
     * Constructor de PanBlanco, añade descripción.
     */
    public PanBlanco(){
        descripcion = "Pan Blanco";
    }

    /**
     * Devuelve el costo de la bagguette con Pan Blanco.
     */
    @Override
    public double cost() {
        return 18;
    }

}
