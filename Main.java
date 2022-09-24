import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("***BIENVENIDO A WaySub***\n"); 
        System.out.println("Por favor elige lo que quieras ordenar: ");
        System.out.println("1 .- Bagguette.\n"
        + "2 .- Pizza. \n");
        int opcion;
        boolean ordenTerminada = false;
        do{
            while (true) {
                try {
                    String opcionUsser = in.nextLine();
                    opcion = Integer.parseInt(opcionUsser);
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println("Por favot elige una opción VALIDA : \n"
                    + "1 .- Bagguette.\n"
                    + "2 .- Pizza. \n");
                }
            }

            if (opcion == 1) {
                System.out.println("Haz  elegido Bagguette, para comenzar elige el tipo de pan que deseas ordenar: ");
            } else if(opcion == 2) {
                int opcionPizza;
                System.out.println("Aquí tienes el menú de pizzas elige la que mas te agrade: " +
                        "1 .- \n " + 
                        "2 .- \n " +
                        "3 .- \n " +
                        "4 .- \n " +
                        "5 .-  ");
            } else {
                System.out.println("Opción no existente, intente nuevamente.");
            }
        } while (ordenTerminada == true);
    }
}


