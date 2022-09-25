package pizza;

import bagguette.Bagguette;

/**
 * Clase AdapterBaguette que implementa el patron de diseño Adapter de una pizza a un baguette
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (25 Septiembre 2022)
 * @see Baguette
 * @see Pizza
 */
public class AdapterBaguette extends Bagguette{
    Pizza porAdaptar;

    /**
     * Constructor parametrizado de un AdapterBaguette a partir de una pizza
     * @param a Pizza por adaptar
     * @throws NullPointerException Si recibe un parametro null
     */
    public AdapterBaguette(Pizza a){
        if(a == null)
            throw new NullPointerException();
        this.porAdaptar = a;
    }

    /**
     * Método consultor de la descripcion
     * @return Un String que describe los ingredientes del baguette-pizza
     */
    @Override
    public String getDescripcion(){
        return this.porAdaptar.getDescripcion();
    }

    /**
     * Método consultor del precio
     * @return Devuelve el precio del baguette-pizza
     */
    public double cost(){
        return this.porAdaptar.costo();
    }

    /**
     * Método que genera un String para imprimir en pantalla del producto
     * @return Devuelve un String detallando el nombre, precio y descripcion del baguette-pizza
     */
    @Override 
    public String toString(){
        return this.porAdaptar.toString();
    }
}
