package ingredientes;

import bagguette.Bagguette;

public class Cebolla extends Ingrediente{

    Bagguette bagguette;

    public Cebolla(Bagguette bagguette){
        this.bagguette = bagguette;
    }

    @Override
    public String getDescripcion() {
        return bagguette.getDescripcion() + ", Cebolla";
    }

    @Override
    public double cost() {
        return 7 + bagguette.cost();
    }
    
}
