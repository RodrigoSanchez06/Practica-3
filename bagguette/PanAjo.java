package bagguette;

/**
 * Clase chiclocentro que hereda de bagguette y 
 * representa a una bagguette con Pan de Ajo.
 */
public class PanAjo extends Bagguette {

    /**
     * Constructor de PanAjo, añade descripción.
     */
    public PanAjo(){
        descripcion = "Pan Ajo";
    }

    /**
     * Devuelve el costo de la bagguette con Pan de Ajo.
     */
    @Override
    public double cost() {
        return 20;
    }
    
}
