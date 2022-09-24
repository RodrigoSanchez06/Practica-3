package ingredientes;

import bagguette.Bagguette;

public class Jamon extends Ingrediente {

    Bagguette bagguette;

    public Jamon(Bagguette bagguette){
        this.bagguette = bagguette;
    }

    @Override
    public String getDescription() {
        return bagguette.getDescripcion() + ", Jamón";
    }

    @Override
    public double cost() {
        return 15 + bagguette.cost();
    }
    
}
