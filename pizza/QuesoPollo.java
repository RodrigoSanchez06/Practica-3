package pizza;

/**
 * Clase QuesoPollo que implementa una pizza QuesoPollo con pollo, queso Cheddar y masa delgada
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see IngredientePizza
 * @see Carne
 * @see Queso
 * @see Masa
 */
public class QuesoPollo extends Pizza {

    /**
     * Constructor por omisión que instancia una pizza QuesoPollo con ingredientes específicos
     */
    public QuesoPollo() {
        setNombre("Pizza de queso y pollo");
        setTipoCarne(new ingredientesPizza.Carne(3));
        setTipoMasa(new ingredientesPizza.Masa(2));
        setTipoQueso(new ingredientesPizza.Queso(1));
        setDescripcion("Pizza con " + this.getTipoCarne() + ", Masa " + this.getTipoMasa() + " y queso " + this.getTipoQueso());
        setCosto(this.tipoCarne.getPrecio()+this.tipoMasa.getPrecio()+this.tipoQueso.getPrecio()+30);
    }

}