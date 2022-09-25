package pizza;

/**
 * Clase Boneless que implementa una pizza Boneless con jamon, queso manchego y masa gruesa
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see IngredientePizza
 * @see Carne
 * @see Queso
 * @see Masa
 */
public class Boneless extends Pizza {

    /**
     * Constructor por omisión que instancia una pizza Boneless con ingredientes específicos
     */
    public Boneless() {
        setNombre("Pizza Boneless");
        setTipoCarne(new ingredientesPizza.Carne(2));
        setTipoMasa(new ingredientesPizza.Masa(1));
        setTipoQueso(new ingredientesPizza.Queso(2));
        setDescripcion("Pizza con " + this.getTipoCarne() + ", Masa " + this.getTipoMasa() + " y queso " + this.getTipoQueso());
        setCosto(this.tipoCarne.getPrecio()+this.tipoMasa.getPrecio()+this.tipoQueso.getPrecio()+30);
    }

}