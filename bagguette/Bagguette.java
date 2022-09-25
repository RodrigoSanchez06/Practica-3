package bagguette;

/**
 * Clase  abstracta que representna a una bagguette
 */
public abstract class Bagguette {
    
    String descripcion = "Sin Bagguette";

    /**
     * Devuelve la descripción de la bagguette preparada.
     * @return descripción de la bagguette.
     */
    public String getDescripcion(){
        return this.descripcion;
    }

    /**
     * devuelve el costo total de los ingredientes agregados.
     * @return devuelve el costo total de los ingredientes agregados.
     */
    public abstract double cost();
}
