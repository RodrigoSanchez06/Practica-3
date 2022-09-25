package ingredientesPizza.masas;

public class Gruesa extends Masa {

    public Gruesa() {
        this.setTipoMasa();

    }

    public void setTipoMasa() {
        this.setTipoMasa(" Masa gruesa");

    }

    @Override
    public String getTipoMasa() {
        return tipoMasa;
    }

}
