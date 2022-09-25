package ingredientes;
import bagguette.Bagguette;

public class Catsup extends Ingrediente {

    Bagguette bagguette;

    public Catsup(Bagguette bagguette){
        this.bagguette = bagguette;
    }

    @Override
    public String getDescripcion() {
        return bagguette.getDescripcion() + ", Catsup";
    }

    @Override
    public double cost() {
        return 5 + bagguette.cost();
    }

    
}
