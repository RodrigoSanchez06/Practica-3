package ingredientesPizza.masas;

public abstract class Masa {
    String tipoMasa;

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public abstract String getTipoMasa();
}