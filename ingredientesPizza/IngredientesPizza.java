package ingredientesPizza;


public abstract class IngredientesPizza{
    protected String nombre;
    protected double precio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setPrecio(double precio){
        if(precio < 0)
            throw new IllegalArgumentException();
        this.precio=precio;
    }

    public double getPrecio(){
        return this.precio;
    }
}
