package pizza;

/**
 * Clase Carnivora que implementa una pizza Carnivora con salchicha, queso Cheddar y masa gruesa
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see IngredientePizza
 * @see Carne
 * @see Queso
 * @see Masa
 */
public class Carnivora extends Pizza {

    /**
     * Constructor por omisión que instancia una pizza Carnivora con ingredientes específicos
     */
    public Carnivora() {
        setNombre("Pizza Carnivora");
        setTipoCarne(new ingredientesPizza.Carne(1));
        setTipoMasa(new ingredientesPizza.Masa(1));
        setTipoQueso(new ingredientesPizza.Queso(1));
        setDescripcion("Pizza con " + this.getTipoCarne() + ", Masa " + this.getTipoMasa() + " y queso " + this.getTipoQueso());
        setCosto(this.tipoCarne.getPrecio()+this.tipoMasa.getPrecio()+this.tipoQueso.getPrecio()+30);
    }

}