package ingredientes;

import bagguette.Bagguette;

public class Pepperoni extends Ingrediente{
    
    Bagguette bagguette;

    public Pepperoni(Bagguette bagguette){
        this.bagguette  = bagguette;
    }

    @Override
    public String getDescription() {
        return bagguette.getDescripcion() + ", Pepperoni";
    }

    @Override
    public double cost() {
        return 20 +  bagguette.cost();
    }



}