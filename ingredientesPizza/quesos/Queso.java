package ingredientesPizza.quesos;

public abstract class Queso {
    String tipoQueso;

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public abstract String getTipoQueso();
}