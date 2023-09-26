import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = 0;
        Lista l = new Lista();

        while(menu != 4){
            System.out.println("------------------------------------");
            System.out.println("Elige entre las siguientes opciones:");
            System.out.println("1. Añadir un usuario a la lista");
            System.out.println("2. Buscar un usuario por su identificador");
            System.out.println("3. Calcular los ingresos totales");
            System.out.println("4. Salir");
            System.out.println("--------");

            try{
                menu = in.nextInt();
            } catch (Exception e){
                System.out.println("Esa no es una opción");
                in.nextLine();
                menu = 0;
            }

            switch (menu){
                case 1:
                    boolean datosValidos = false;
                    while (!datosValidos) {
                        try {
                            System.out.println("Dime el correo, la contraseña, los descuentos y si es o no premium");
                            Usuario e = new Usuario(in.next(), in.next(), in.nextDouble(), in.nextBoolean());
                            datosValidos = true;
                            l.añadir_usuario(e);
                        } catch (InputMismatchException e) {
                            System.out.println("Alguno de los datos que proporcionaste no es válido. Inténtalo de nuevo.");
                            in.nextLine();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Dime el id del anunciante que buscas");
                    String id = in.next();
                    l.buscar_usuario(id);
                    break;
                case 3:
                    System.out.println("Dime el correo del anunciante sobre el que quieres saber los ingresos");
                    String correo = in.next();
                    l.ingresos_totales(correo);
                    break;
            }
        }
    }
}