import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iniciarPrograma();

    }

    public static void iniciarPrograma() {
        boolean b;
        do {
            mostrarMenu();
            b = elegirOpcion(ingresarOpcion());

        } while (!b);
    }

    public static void mostrarMenu() {
        System.out.println("*                   Bienvenido                     *");
        System.out.println("Por favor, antes de continuar, seleccione una opción");
        System.out.println("[1] Ingresar datos");
        System.out.println("[2] Mostrar sismo de mayor magnitud");
        System.out.println("[3] Contar sismos mayores o iguales a 5.0");
        System.out.println("[4] Enviar SMS por cada sismo mayor o igual a 7.0");
        System.out.println("[5] Salir");

    }

    public static String ingresarOpcion(){
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    public static boolean elegirOpcion(String seleccionOpcion) {
        boolean b;
        switch (seleccionOpcion) {
            case "1": {
                System.out.println("Usted ha seleccionado ingresar datos");
                b = true;
                ingresarDatos();
                break;
            }
            case "2": {
                System.out.println("Usted ha seleccionado mostrar sismo de mayor magnitud");
                b = true;
                mostrarSismoMayorLongitud();
                break;
            }
            case "3":{
                System.out.println("Usted ha seleccionado contar sismos");
                b = true;
                contarSismos();
                break;
            }
            case "4":{
                System.out.println("Usted ha seleccionado enviar SMS");
                b = true;
                enviarSMS();
                break;
            }
            case "5":{
                b = true;
                System.out.println("El programa ha finalizado");
                break;
            }
            default: {
                System.out.println("opcion no valida");
                b = false;
                break;
            }

        }
        return b;
    }

    private static void ingresarDatos() {
    }

    private static void  mostrarSismoMayorLongitud() {
    }

    private static void contarSismos() {
    }

    private static void enviarSMS() {
    }
}
