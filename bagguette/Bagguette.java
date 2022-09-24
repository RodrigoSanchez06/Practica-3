package bagguette;

public abstract class Bagguette {
    String descripcion = "Sin Bagguette";

    public String getDescripcion(){
        return this.descripcion;
    }

    public abstract double cost();
}
