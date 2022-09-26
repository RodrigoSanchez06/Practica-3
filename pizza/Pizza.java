package pizza;

import ingredientesPizza.*;

/**
 * Clase abstracta pizza que implementa los detalles principales de cualquier tipo de pizza para ser definidos posterior y particularmente
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see IngredientePizza
 * @see Carne
 * @see Queso
 * @see Masa
 */
public abstract class Pizza {

    /**
     * Atributos de tipo String que almacenan el nombre y la descripcion de la pizza respectivamente
     */
    protected String nombre, descripcion;

    /**
     * Atributo de tipo Queso que almacena el tipo de queso de la pizza
     */
    protected Queso tipoQueso;

    /**
     * Atributo de tipo Masa que almacena el tipo de masa de la pizza
     */
    protected Masa tipoMasa;

    /**
     * Atributo de tipo Carne que almacena el tipo de carne de la pizza
     */
    protected Carne tipoCarne;

    /**
     * Atributo de tipo double que almacena el precio de la pizza
     */
    protected double costo;

    /**
     * Método consultor de la descripcion de una pizza
     * @return Devuelve un String detallando una pizza y sus ingredientes
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Método consultor del nombre de una pizza
     * @return Devuelve un String con el nombre de la pizza
     */
    public String getNombre() {
        return this.nombre;

    }

    /**
     * Metodo consultor del tipo de carne de una pizza
     * @return Devuelve un String que detalla el tipo de carne que contiene esta pizza
     */
    public String getTipoCarne() {
        return this.tipoCarne.getNombre();
    }

    /**
     * Metodo consultor del tipo de queso de una pizza
     * @return Devuelve un String que detalla el tipo de queso que contiene esta pizza
     */
    public String getTipoQueso() {
        return this.tipoQueso.getNombre();
    }

    /**
     * Metodo consultor del tipo de masa de una pizza
     * @return Devuelve un String que detalla el tipo de masa que contiene esta pizza
     */
    public String getTipoMasa() {
        return this.tipoMasa.getNombre();
    }

    /**
     * Metodo consultor del precio de una pizza
     * @return Devuelve el precio de una pizza
     */
    public double costo() {
        return this.costo;
    }

    /**
     * Metodo modificador del tipo de carne de una pizza
     * @param carnes Nuevo tipo de carne por asignar
     * @throws NullPointerException si recibe un parametro null
     */
    public void setTipoCarne(Carne carnes) {
        if(carnes == null)
            throw new NullPointerException();
        this.tipoCarne = (Carne) carnes;
    }

    /**
     * Metodo modificador del tipo de queso de una pizza
     * @param tipoQueso Nuevo tipo de queso por asignar
     * @throws NullPointerException si recibe un parametro null
     */
    public void setTipoQueso(Queso tipoQueso) {
        if(tipoQueso == null)
            throw new NullPointerException();
        this.tipoQueso = tipoQueso;
    }

    /**
     * Metodo modificador del tipo de masa de una pizza
     * @param tipoMasa Nuevo tipo de masa por asignar
     * @throws NullPointerException si recibe un parametro null
     */
    public void setTipoMasa(Masa tipoMasa) {
        if(tipoMasa == null)
            throw new NullPointerException();
        this.tipoMasa = tipoMasa;
    }

    /**
     * Metodo modificador de tipo de la descripcion de una pizza
     * @param descripcion Nueva descripcion por asignar
     * @throws NullPointerException si recibe un parametro null
     */
    public void setDescripcion(String descripcion) {
        if(descripcion == null)
            throw new NullPointerException();
        this.descripcion = descripcion;
    }

    /**
     * Metodo modificador del nombre de una pizza
     * @param nombre Nuevo nombre por asignar
     * @throws NullPointerException si recibe un parametro null
     */
    public void setNombre(String nombre) {
        if(nombre == null)
            throw new NullPointerException();
        this.nombre = nombre;
    }

    /**
     * Metodo modificador del precio de una pizza
     * @param costo Nuevo precio por asignar
     */
    public void setCosto(double costo) {
        if(costo < 1)
            throw new IllegalArgumentException();
        this.costo = costo;
    }

    /**
     * Metodo que prepara un String que describe la pizza para imprimir en pantalla
     * @return Devuelve un String detallando el nombre, descripcion y precio de la pizza
     */
    @Override
    public String toString(){
            return this.getNombre().toUpperCase()+"n"+this.descripcion+"\n"+"Precio: $"+this.costo();
    }

}
