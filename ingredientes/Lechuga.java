package ingredientes;

import bagguette.Bagguette;

public class Lechuga extends Ingrediente {
    Bagguette bagguette;

    public Lechuga(Bagguette bagguette){
        this.bagguette = bagguette;
    }

    @Override
    public String getDescripcion() {
        return bagguette.getDescripcion() + ", Lechuga";
    }

    @Override
    public double cost() {
        return 4 + bagguette.cost();
    }
}
