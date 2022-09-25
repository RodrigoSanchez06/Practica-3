package ingredientes;

import bagguette.Bagguette;

public class Mayonesa extends Ingrediente{

    Bagguette bagguette;

    public Mayonesa(Bagguette bagguette){
        this.bagguette = bagguette;
    }

    @Override
    public String getDescripcion() {
        return bagguette.getDescripcion() + ", Mayonesa";
    }

    @Override
    public double cost() {
        return 6 + bagguette.cost();
    }
}
