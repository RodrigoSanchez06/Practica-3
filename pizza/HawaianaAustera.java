package pizza;

/**
 * Clase HawaianaAustera que implementa una pizza HawaianaAustera con jamon, queso manchego y masa delgada
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see IngredientePizza
 * @see Carne
 * @see Queso
 * @see Masa
 */
public class HawaianaAustera extends Pizza {

    /**
     * Constructor por omisión que instancia una pizza HawaianaAustera con ingredientes específicos
     */
    public HawaianaAustera() {
        setNombre("Pizza HawaianaAustera");
        setTipoCarne(new ingredientesPizza.Carne(2));
        setTipoMasa(new ingredientesPizza.Masa(2));
        setTipoQueso(new ingredientesPizza.Queso(2));
        setDescripcion("Pizza con " + this.getTipoCarne() + ", Masa " + this.getTipoMasa() + " y queso " + this.getTipoQueso());
        setCosto(this.tipoCarne.getPrecio()+this.tipoMasa.getPrecio()+this.tipoQueso.getPrecio()+30);
    }

}