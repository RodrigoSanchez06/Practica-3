package bagguette;

public class PanBlanco extends Bagguette{

    public PanBlanco(){
        descripcion = "Pan Blanco";
    }

    @Override
    public double cost() {
        return 18;
    }

}
