package ingredientes;

import bagguette.Bagguette;

public class Jitomate extends Ingrediente{

    Bagguette bagguette;    

    public Jitomate(Bagguette bagguette){
        this.bagguette = bagguette;
    }

    @Override
    public String getDescription() {
        return bagguette.getDescripcion() + ", Jitomate";
    }

    @Override
    public double cost() {
        return 9 + bagguette.cost();
    }
    
}