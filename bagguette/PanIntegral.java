package bagguette;

/**
 * Clase chiclocentro que hereda de bagguette y 
 * representa a una bagguette con Pan Integral.
 */
public class PanIntegral extends Bagguette {

    /**
     * Constructor de PanIntegral, añade descripción.
     */
    public PanIntegral(){
        descripcion = "Pan Integral";
    }

    /**
     * Devuelve el costo de la bagguette con Pan Integral.
     */
    @Override
    public double cost() {
        return 22;
    }
   
}
