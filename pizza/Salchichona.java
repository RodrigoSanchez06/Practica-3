package pizza;

/**
 * Clase Salchichona que implementa una pizza Salchichona con salchicha, queso manchego y masa gruesa
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see IngredientePizza
 * @see Carne
 * @see Queso
 * @see Masa
 */
public class Salchichona extends Pizza {

    /**
     * Constructor por omisión que instancia una pizza Salchichona con ingredientes específicos
     */
    public Salchichona() {
        setNombre("Pizza Salchichona");
        setTipoCarne(new ingredientesPizza.Carne(1));
        setTipoMasa(new ingredientesPizza.Masa(1));
        setTipoQueso(new ingredientesPizza.Queso(2));
        setDescripcion("Pizza con " + this.getTipoCarne() + ", Masa " + this.getTipoMasa() + " y queso " + this.getTipoQueso());
        setCosto(this.tipoCarne.getPrecio()+this.tipoMasa.getPrecio()+this.tipoQueso.getPrecio()+30);
    }

}