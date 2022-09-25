package pizza;

public class Boneless extends Pizza {

    public Boneless() {
        setNombre("Pizza Boneless");
        setTipoCarne(new ingredientesPizza.Carne(2));
        setTipoMasa(new ingredientesPizza.Masa(1));
        setTipoQueso(new ingredientesPizza.Queso(2));
        setDescripcion("Pizza con " + this.getTipoCarne() + ", Masa " + this.getTipoMasa() + " y queso " + this.getTipoQueso());
        setCosto(this.tipoCarne.getPrecio()+this.tipoMasa.getPrecio()+this.tipoQueso.getPrecio()+30);
    }

}