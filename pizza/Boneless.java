package pizza;

public class Boneless extends Pizza {

    public Boneless() {
        setNombre("Pizza Boneless");

        setTipoCarne(new ingredientesPizza.carnes.Jamon());
        setTipoMasa(new ingredientesPizza.masas.Gruesa());
        setTipoQueso(new ingredientesPizza.quesos.Manchego());
        setDescripcion("Pizza con" + this.getTipoCarne() + this.getTipoMasa() + this.getTipoQueso());
        setCosto(90);
    }

}