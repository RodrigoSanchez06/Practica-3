package ingredientesPizza.carnes;

import ingredientesPizza.IngredientesPizza;

public class Jamon extends IngredientesPizza {

    public Jamon() {
        this.setTipoCarne();
    }

    public void setTipoCarne() {
        this.setTipoCarne(" Jamon");
    }

    @Override
    public String getTipoCarne() {
        return tipoCarne;
    }
}