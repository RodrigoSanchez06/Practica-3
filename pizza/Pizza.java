package pizza;

import ingredientesPizza.IngredientesPizza;
import ingredientesPizza.masas.Gruesa;
import ingredientesPizza.quesos.Manchego;

public abstract class Pizza {
    String nombre, descripcion;
    Manchego tipoQueso;
    Gruesa tipoMasa;
    IngredientesPizza tipoCarne;
    double costo;

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getNombre() {
        return this.nombre;

    }

    public String getTipoCarne() {
        return this.tipoCarne.getTipoCarne();
    }

    public String getTipoQueso() {
        return this.tipoQueso.getTipoQueso();
    }

    public String getTipoMasa() {
        return this.tipoMasa.getTipoMasa();
    }

    public double costo() {
        return this.costo;
    }

    public void setTipoCarne(IngredientesPizza carnes) {
        this.tipoCarne = carnes;
    }

    public void setTipoQueso(Manchego tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public void setTipoMasa(Gruesa tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
