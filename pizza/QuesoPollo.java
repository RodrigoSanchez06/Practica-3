package pizza;

public class QuesoPollo extends Pizza {

    public QuesoPollo() {
        setNombre("Pizza de queso y pollo");
        setTipoCarne(new ingredientesPizza.Carne(3));
        setTipoMasa(new ingredientesPizza.Masa(2));
        setTipoQueso(new ingredientesPizza.Queso(1));
        setDescripcion("Pizza con " + this.getTipoCarne() + ", Masa " + this.getTipoMasa() + " y queso " + this.getTipoQueso());
        setCosto(this.tipoCarne.getPrecio()+this.tipoMasa.getPrecio()+this.tipoQueso.getPrecio()+30);
    }

}