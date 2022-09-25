package pizza;

import ingredientesPizza.*;

public abstract class Pizza {
    protected String nombre, descripcion;
    protected Queso tipoQueso;
    protected Masa tipoMasa;
    protected Carne tipoCarne;
    protected double costo;

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getNombre() {
        return this.nombre;

    }

    public String getTipoCarne() {
        return this.tipoCarne.getNombre();
    }

    public String getTipoQueso() {
        return this.tipoQueso.getNombre();
    }

    public String getTipoMasa() {
        return this.tipoMasa.getNombre();
    }

    public double costo() {
        return this.costo;
    }

    public void setTipoCarne(Carne carnes) {
        this.tipoCarne = (Carne) carnes;
    }

    public void setTipoQueso(Queso tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public void setTipoMasa(Masa tipoMasa) {
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
