package ingredientes;

import bagguette.Bagguette;

/**
 * Clase que representa al ingrediente Mayonesa y hereda de ingrediente.
 */
public class Mayonesa extends Ingrediente{

    Bagguette bagguette;

    /**
     * Constructor de Mayonesa asigna a la bagguette sobre  la cual se estará
     * operando.
     * @param bagguette bagguette a la que se le agrega el ingrediente.
     */
    public Mayonesa(Bagguette bagguette){
        this.bagguette = bagguette;
    }

    /**
     * devuelve la descripción de la bagguette con el ingrediente añadido.
     * @return descripción de la bagguette añadiendo el ingrediente.
     */
    @Override
    public String getDescripcion() {
        return bagguette.getDescripcion() + ", Mayonesa";
    }

    /**
     * Devuelve el costo anterior de la bagguette añadiendo el costo del ingrediente
     * actual.
     * @return costo anterior de la bagguette añadiendo el costo del ingrediente actual.
     */
    @Override
    public double cost() {
        return 6 + bagguette.cost();
    }
}
