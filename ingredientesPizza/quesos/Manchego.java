package ingredientesPizza.quesos;

public class Manchego extends Queso {
    public Manchego() {
        this.setTipoQueso();
    }

    public void setTipoQueso() {
        this.setTipoQueso(" Queso manchego");
    }

    @Override
    public String getTipoQueso() {
        return tipoQueso;
    }
}
