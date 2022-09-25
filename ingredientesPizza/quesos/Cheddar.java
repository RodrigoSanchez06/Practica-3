package ingredientesPizza.quesos;

public class Cheddar extends Queso {
    public Cheddar() {
        this.setTipoQueso();
    }

    public void setTipoQueso() {
        this.setTipoQueso(" Queso cheddar");
    }

    @Override
    public String getTipoQueso() {
        return tipoQueso;
    }
}
