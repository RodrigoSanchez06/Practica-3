package ingredientesPizza;

public class Queso extends IngredientesPizza {
    public Queso(int eleccion){
        if(eleccion != 1 && eleccion != 2)
            throw new IllegalArgumentException();
        switch(eleccion){
            case 1:
                this.setNombre("Cheddar");
                this.setPrecio(20);
                break;
            case 2:
                this.setNombre("Manchego");
                this.setPrecio(15);
                break;
        }
    }
}
