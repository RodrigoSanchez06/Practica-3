package ingredientesPizza;

import pizza.Pizza;

public abstract class IngredientesPizza extends Pizza {
    protected String tipoCarne;

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public abstract String getTipoCarne();
}
