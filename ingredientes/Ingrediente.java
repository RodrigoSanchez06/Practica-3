package ingredientes;
import bagguette.Bagguette;

/**
 * Clase abstracta que representa un ingrediente y hereda de Bagguette.
 */
public abstract class Ingrediente extends Bagguette{

        /**
         * devuelve la descripción de la bagguette con el ingrediente añadido.
         * @return descripción de la bagguette añadiendo el ingrediente.
         */
        public abstract String getDescripcion();
}
