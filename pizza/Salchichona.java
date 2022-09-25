package pizza;

public class Salchichona extends Pizza {

    public Salchichona() {
        setNombre("Pizza Salchichona");
        setTipoCarne(new ingredientesPizza.Carne(1));
        setTipoMasa(new ingredientesPizza.Masa(1));
        setTipoQueso(new ingredientesPizza.Queso(2));
        setDescripcion("Pizza con" + this.getTipoCarne() + this.getTipoMasa() + this.getTipoQueso());
        setCosto(this.tipoCarne.getPrecio()+this.tipoMasa.getPrecio()+this.tipoQueso.getPrecio()+30);
    }

}