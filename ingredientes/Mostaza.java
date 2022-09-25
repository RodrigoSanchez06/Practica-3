package ingredientes;

import bagguette.Bagguette;

public class Mostaza extends Ingrediente{
    
    Bagguette  bagguette;

    public Mostaza(Bagguette bagguette){
        this.bagguette = bagguette;
    }

    @Override
    public String getDescripcion() {
        return bagguette.getDescripcion() + ", Mostaza";
    }

    @Override
    public double cost() {
        return 6 + bagguette.cost();
    }
}
