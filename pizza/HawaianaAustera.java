package pizza;

public class HawaianaAustera extends Pizza {

    public HawaianaAustera() {
        setNombre("Pizza HawaianaAustera");
        setTipoCarne(new ingredientesPizza.Carne(2));
        setTipoMasa(new ingredientesPizza.Masa(2));
        setTipoQueso(new ingredientesPizza.Queso(2));
        setDescripcion("Pizza con" + this.getTipoCarne() + this.getTipoMasa() + this.getTipoQueso());
        setCosto(this.tipoCarne.getPrecio()+this.tipoMasa.getPrecio()+this.tipoQueso.getPrecio()+30);
    }

}