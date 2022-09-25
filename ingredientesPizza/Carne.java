package ingredientesPizza;

public class Carne extends IngredientesPizza {
    public Carne(int eleccion){
        if(eleccion != 1 && eleccion != 2 && eleccion != 3)
            throw new IllegalArgumentException();
        switch(eleccion){
            case 1:
                this.setNombre("Salchicha");
                this.setPrecio(20);
                break;
            case 2:
                this.setNombre("Jamon");
                this.setPrecio(15);
                break;
            case 3:
                this.setNombre("Pollo");
                this.setPrecio(20);
                break;
        }
    }
}
