package bagguette;

public class PanAjo extends Bagguette {

    public PanAjo(){
        descripcion = "Baguette con: Pan Ajo";
    }

    @Override
    public double cost() {
        return 20;
    }
    
}
