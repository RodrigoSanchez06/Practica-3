package ingredientesPizza;

public class Masa extends IngredientesPizza {
    public Masa(int eleccion){
        if(eleccion != 1 && eleccion != 2)
            throw new IllegalArgumentException();
        switch(eleccion){
            case 1:
                this.setNombre("Gruesa");
                this.setPrecio(15);
                break;
            case 2:
                this.setNombre("Delgada");
                this.setPrecio(10);
                break;
        }
    }
}
