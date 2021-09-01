import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iniciarPrograma();

    }
    public static void iniciarPrograma() {
        boolean b;
        do {
            mostrarMenu();
            b = elegirOpcion();

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

    public static boolean elegirOpcion() {
        boolean b;
        String seleccionOpcion;
        int c = 0;
            do {
               mostrarMenu();
                seleccionOpcion = ingresarOpcion();
                switch (seleccionOpcion) {

                    case "1": {
                        System.out.println("Usted ha seleccionado ingresar datos");
                        b = true;
                        for (int i = 0; i < datos().length; i++) {
                            System.out.println("Sismos " + datos()[i]);
                        }
                        c=1;
                        break;

                    }
                    case "2": {
                        System.out.println("Usted ha seleccionado mostrar sismo de mayor magnitud");
                        b = true;
                        System.out.println("el mayor es " + buscarMayorSismo(datos()));
                        c=1;
                        break;
                    }
                    case "3": {
                        System.out.println("Usted ha seleccionado contar sismos");
                        b = true;
                        contarSismos();
                        c=1;
                        break;
                    }
                    case "4": {
                        System.out.println("Usted ha seleccionado enviar SMS");
                        b = true;
                        enviarSMS();
                        c=1;
                        break;
                    }
                    case "5": {
                        b = true;
                        System.out.println("El programa ha finalizado");
                        c=2;
                        break;
                    }
                    default: {
                        System.out.println("opcion no valida");
                        b = false;
                        break;
                    }


                }

            } while (c !=2);

        return b;
    }

    public static double ingresarDatos() {
        double numero = 0;
        numero = (double)(Math.random()*9.9);
        return numero;
    }

    public static double buscarMayorSismo(double[] datos) {
        double mayor = 0;
        for(int i = 0; i < datos.length; i++){
            if(mayor< datos[i]){
            mayor = datos[i];
        }
        }
        return mayor;
    }

    public static void contarSismos() {
    }

    public static void enviarSMS() {
    }


    public static double[] datos(){
        double[] arr = new double[69];
        for (int i = 0; i<arr.length;i++){
            arr[i] = ingresarDatos();

        }return arr;
    }

}
