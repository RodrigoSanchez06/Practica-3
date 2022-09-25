package ingredientes;

import bagguette.Bagguette;

public class Pollo extends Ingrediente{
    
    Bagguette bagguette;

    public Pollo(Bagguette bagguette){
        this.bagguette = bagguette;
    }

    @Override
    public String getDescription() {
        return bagguette.getDescripcion() + ", Pollo";
    }

    @Override
    public double cost() {
        return 25 + bagguette.cost();
    }

}