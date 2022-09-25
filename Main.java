import java.util.InputMismatchException;
import java.util.Scanner;
import bagguette.Bagguette;
import bagguette.PanAjo;
import bagguette.PanBlanco;
import bagguette.PanIntegral;
import ingredientes.*;
import pizza.*;

/**
 * Clase principal del restaurante WaySub.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("***BIENVENIDO A WaySub***\n"); 
        System.out.println("Por favor elige lo que quieras ordenar: ");
        System.out.println("1 .- Bagguette.\n"
        + "2 .- Pizza. ");
        int opcion;
        boolean ordenTerminada = false;
        do{ //Valida opcionens
            while (true) {
                try { //Valida si opcion Bagguette O Pizza es correcto
                    String opcionUsser = in.nextLine();
                    opcion = Integer.parseInt(opcionUsser);
                    break; 
                } catch (NumberFormatException nfe) {
                    System.out.println("Por favor elige una opción VALIDA : \n"
                    + "1 .- Bagguette.\n"
                    + "2 .- Pizza. ");
                }
            }
            //Valida si Bagguette o Pizza
            if (opcion == 1) {
                System.out.println("Haz  elegido Bagguette, para comenzar ");
                boolean panCorrecto =  false;
                int opcionPan;
                do{ //Valida tipo de pan es correcto
                    System.out.println("elige el tipo de pan que deseas ordenar: ");
                    System.out.println("1 .- Pan Blanco \n" +
                            "2 .- Pan Ajo \n" + 
                            "3 .- Pan Integral ");
                    while (true) {
                        try {
                            String StringPan = in.nextLine();
                            opcionPan = Integer.parseInt(StringPan);
                            break;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Por favor elige una opción VALIDA : \n"
                                + "1 .- Pan Blanco \n " +
                                "2 .- Pan Ajo \n" + 
                                "3 .- Pan Integral ");
                        }
                    }//Valida opciones de pan
                    switch (opcionPan) {
                        case 1: //Arma Bagguette
                            System.out.println("haz elegido tu bagguette con pan Blanco, ");
                            Bagguette panBlanco = new PanBlanco();
                            panBlanco = ordenaIngredientes(panBlanco);
                            imprimeTicket(panBlanco);
                            panCorrecto =  true;
                            ordenTerminada = true;
                            break;
                        case 2:  //Arma Bagguette
                            System.out.println("haz elegido tu bagguette con pan Ajo, ");
                            Bagguette panAjo = new PanAjo();
                            panAjo = ordenaIngredientes(panAjo);
                            imprimeTicket(panAjo);
                            panCorrecto = true;
                            ordenTerminada = true;
                            break;
                        case 3://Arma Bagguette
                            System.out.println("haz elegido tu bagguette con pan Integral, ");
                            Bagguette panIntegral = new PanIntegral();
                            panIntegral = ordenaIngredientes(panIntegral);
                            imprimeTicket(panIntegral);
                            panCorrecto = true;
                            ordenTerminada = true;
                            break;
                        default:
                            System.out.println("Operación no existente, intente de nuevo");
                            break;
                    }
                }while(!panCorrecto);
                
            } else if(opcion == 2) {
                Scanner sc = new Scanner(System.in);
                boolean opcionValida = false;
                int opcionPizza=0;
                Pizza ordenada=null;
                do{
                    System.out.println("Aquí tienes el menú de pizzas elige la que mas te agrade:\n " +
                        "1 .- Boneless\n " + 
                        "2 .- Carnivora\n " +
                        "3 .- HawaianaAustera\n " +
                        "4 .- QuesoPollo\n " +
                        "5 .- Salchichona");

                    try{
                        opcionPizza = sc.nextInt();
                    }
                    catch(InputMismatchException e){
                        System.out.println("\nPor favor escoja una opcion valida!!");
                        sc.next();
                    }
                    if(opcionPizza < 1 || opcionPizza > 5){
                        System.out.println("\nPor favor escoja una opcion dentro del menu!!");
                    }
                    else {
                        opcionValida=true;
                    }
                }
                while(!opcionValida);
                switch(opcionPizza){
                    case 1:
                        ordenada = new Boneless();
                        break;
                    case 2:
                        ordenada = new Carnivora();
                        break;
                    case 3:
                        ordenada = new HawaianaAustera();
                        break;
                    case 4:
                        ordenada = new QuesoPollo();
                        break;
                    case 5:
                        ordenada = new Salchichona();
                        break;
                }
                Main.imprimeTicket(new AdapterBaguette(ordenada));
            } else {
                System.out.println("Opción no existente, intente nuevamente.");
                System.out.println("Por favor elige lo que quieras ordenar: ");
                System.out.println("1 .- Bagguette.\n"
                + "2 .- Pizza. ");
            }
        } while (ordenTerminada != true);
        System.out.println("Hasta pronto!!!");
    }

    /**
     * Metodo estatico que valida los  ingredientes y su cantidad y los agrega a la bagguette
     * @param bagguette bagguette a la que se le agregan los ingredientes
     * @return bagguette con todos los ingredientes
     */
    public static Bagguette  ordenaIngredientes(Bagguette bagguette){
        System.out.println("Elige alguno de los siguientes ingredientes para tu bagguette\n" + 
                "(Recuerda que solo puedes repetir un máximo de 3 veces cada ingrediente): ");
        Scanner in = new Scanner(System.in);
        Bagguette bagguetteEnPreparacion = bagguette;
        int opcionIngrediente = 0, maxIngredientes = 3;
        int catsup, cebolla, jamon, jitomate, lechuga, mayonesa, mostaza, pepperoni, pollo;
        catsup = cebolla = jamon = jitomate = lechuga = mayonesa = mostaza = pepperoni = pollo = 0;
        do{
            System.out.println("1 .- Catsup \n" +
                    "2 .- Cebolla \n" +
                    "3 .- Jamón \n" + 
                    "4 .- Jitomate  \n" + 
                    "5 .- Lechuga \n" +
                    "6 .- Mayonesa \n" +
                    "7 .- Mostaza \n" + 
                    "8 .- Pepperoni \n" +
                    "9 .- Pollo \n" + 
                    "10 .- TERMINAR ORDEN.");
            while (true) {
                try {
                    String ingredienteString = in.nextLine();
                    opcionIngrediente = Integer.parseInt(ingredienteString);
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Por favot elige una opción VALIDA : \n");
                    System.out.println("1 .- Catsup \n" +
                    "2 .- Cebolla \n" +
                    "3 .- Jamón \n" + 
                    "4 .- Jitomate  \n" + 
                    "5 .- Lechuga \n" +
                    "6 .- Mayonesa \n" +
                    "7 .- Mostaza \n" + 
                    "8 .- Pepperoni \n" +
                    "9 .- Pollo \n" +
                    "10 .- TERMINAR ORDEN."); 
                }
            }
                switch (opcionIngrediente) {
                    case 1:
                        if (catsup >= maxIngredientes) {
                            System.out.println("Haz superado la cantidad máxima de Catsup.");
                        } else {
                            bagguetteEnPreparacion = new Catsup(bagguetteEnPreparacion);
                            catsup++;
                        }
                        break;
                    case 2:
                        if (cebolla >= maxIngredientes) {
                            System.out.println("Haz superado la cantidad máxima de Cebolla.");
                        } else {
                            bagguetteEnPreparacion = new Cebolla(bagguetteEnPreparacion);
                            cebolla++;
                        }
                        break;
                    case 3:
                        if (jamon >= maxIngredientes) {
                            System.out.println("Haz superado la cantidad máxima de Jamón.");
                        } else {
                            bagguetteEnPreparacion = new Jamon(bagguetteEnPreparacion);
                            jamon++;
                        }
                        break;
                    case 4:
                        if (jitomate >= maxIngredientes){
                            System.out.println("Haz superado la cantidad máxima de Jitomate.");
                        } else {
                            bagguetteEnPreparacion = new Jitomate(bagguetteEnPreparacion);
                            jitomate++;
                        }
                        break;
                    case 5:
                        if (lechuga >= maxIngredientes) {
                            System.out.println("Haz superado la cantidad máxima de Lechuga.");
                        } else {
                            bagguetteEnPreparacion = new Lechuga(bagguetteEnPreparacion);
                            lechuga++;
                        }
                        break;
                    case 6:
                        if (mayonesa >= maxIngredientes) {
                            System.out.println("Haz superado la cantidad máxima de mayonesa.");
                        } else {
                            bagguetteEnPreparacion = new Mayonesa(bagguetteEnPreparacion);
                            mayonesa++;
                        }
                        break;
                    case 7:
                        if (mostaza >= maxIngredientes) {
                            System.out.println("Haz superado la cantidad máxima de mostaza.");
                        } else {
                            bagguetteEnPreparacion = new Mostaza(bagguetteEnPreparacion);
                            mostaza++;
                        }
                        break;
                    case 8:
                        if (pepperoni >= maxIngredientes) {
                            System.out.println("Haz superado la cantidad máxima de pepperoni.");
                        } else {
                            bagguetteEnPreparacion = new Pepperoni(bagguetteEnPreparacion);
                            pepperoni++;
                        }
                        break;
                    case 9:
                        if (pollo >= maxIngredientes) {
                            System.out.println("Haz superado la cantidad máxima de pollo.");
                        } else {
                            bagguetteEnPreparacion = new Pollo(bagguetteEnPreparacion);
                            pollo++;
                        }
                        break;
                    case 10:
                        System.out.println("Se ha mandado tu orden y tu ticket será impreso...");
                        break;
                    default:
                        System.out.println("Opción no existente intenta de nuevo por favor.");
                        break;
                }
        }while(opcionIngrediente != 10);
        return  bagguetteEnPreparacion;
    }

    /**
     * Metodo estatico que imprime el ticket de una orden.
     * @param bagguette bagguett a imprimir el ticket.
     */
    public static void imprimeTicket(Bagguette bagguette){
        System.out.println("****TICKET****");
        System.out.println("Compra: " + bagguette.getDescripcion());
        System.out.println("TOTAL: " + bagguette.cost());
        System.out.println("****VUELVA PRONTO****");
    }
}