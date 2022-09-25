package ingredientesPizza;

/**
 * Clase abstracta IngredientesPizza que implementa los detalles principales de un ingrediente de pizza para su posterior definicion
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 */
public abstract class IngredientesPizza{

    /**
     * Atributo de tipo String que almacena el nombre del ingrediente
     */
    protected String nombre;

    /**
     * Atributo de tipo double que almacena el precio del ingrediente
     */
    protected double precio;

    /**
     * Método modificador del nombre de un ingrediente de pizza
     * @param nombre Nombre por asignar
     * @throws NullPointerException si recibe un parametro null
     */
    public void setNombre(String nombre) {
        if(nombre == null)
            throw new NullPointerException();
        this.nombre = nombre;
    }

    /**
     * Metodo consultor del nombre del ingrediente
     * @return Devuelve un String con el nombre del ingrediente
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Método modificador del precio de un ingrediente
     * @param precio Nuevo precio por asignar
     * @throws IllegalArgumentException En caso de recibir un precio 0 o negativo
     */
    public void setPrecio(double precio){
        if(precio < 0)
            throw new IllegalArgumentException();
        this.precio=precio;
    }

    /**
     * Método consultor del precio de un ingrediente
     * @return Devuelve el precio de este ingrediente
     */
    public double getPrecio(){
        return this.precio;
    }
}
