
package Vista;
import Modelo.MenuDelDia;
import Modelo.MenuEconomico;
import Modelo.MenuNinos;
import Modelo.MenuACarta;
import java.util.Scanner;
import Controlador.CuentaPorPagar;


public class RestauranteMenu {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println("     BIENVENIDO AL SISTEMA DE RESTAURANTE   ");
        System.out.println("============================================");

        System.out.print(" Ingrese el nombre del cliente: ");
        String nombreCliente = sc.nextLine().trim();

        CuentaPorPagar cuenta = new CuentaPorPagar(nombreCliente);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- TIPOS DE MENU DISPONIBLES ---");
            System.out.println(" 1. Menú a la Carta");
            System.out.println(" 2. Menú del Día");
            System.out.println(" 3. Menú de Niños");
            System.out.println(" 4. Menú Económico");
            System.out.println(" 5. Ver cuenta y salir");
            System.out.print(" Seleccione una opción: ");

            int opcion = leerEntero();

            switch (opcion) {
                case 1:
                    cuenta.agregarMenu(registrarMenuACarta());
                    System.out.println("  Menú a la Carta agregado.");
                    break;
                case 2:
                    cuenta.agregarMenu(registrarMenuDelDia());
                    System.out.println("  Menú del Día agregado.");
                    break;
                case 3:
                    cuenta.agregarMenu(registrarMenuNinos());
                    System.out.println("  Menú de Niños agregado.");
                    break;
                case 4:
                    cuenta.agregarMenu(registrarMenuEconomico());
                    System.out.println("  Menú Económico agregado.");
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println(" Opción no válida. Intente de nuevo.");
            }
        }
        // Mostrar la cuenta final
        System.out.println();
        cuenta.imprimirCuenta();
    }

    private static MenuACarta registrarMenuACarta() {
        System.out.println("\n=== MENU A LA CARTA ===");
        System.out.print(" Nombre del plato             : ");
        String nombre = sc.nextLine().trim();
        System.out.print(" Valor inicial del menú       : $");
        double valorInicial = leerDecimal();
        System.out.print(" Valor porción de guarnición  : $");
        double guarnicion = leerDecimal();
        System.out.print(" Valor de bebida              : $");
        double bebida = leerDecimal();
        System.out.print(" Porcentaje adicional servicio: ");
        double porcServicio = leerDecimal();
        return new MenuACarta(nombre, valorInicial, guarnicion, bebida, porcServicio);
    }

    private static MenuDelDia registrarMenuDelDia() {
        System.out.println("\n=== MENU DEL DIA ===");
        System.out.print(" Nombre del plato    : ");
        String nombre = sc.nextLine().trim();
        System.out.print(" Valor inicial       : $");
        double valorInicial = leerDecimal();
        System.out.print(" Valor de postre     : $");
        double postre = leerDecimal();
        System.out.print(" Valor de bebida     : $");
        double bebida = leerDecimal();
        return new MenuDelDia(nombre, valorInicial, postre, bebida);
    }

    private static MenuNinos registrarMenuNinos() {
        System.out.println("\n=== MENU DE NIÑOS ===");
        System.out.print(" Nombre del plato         : ");
        String nombre = sc.nextLine().trim();
        System.out.print(" Valor inicial            : $");
        double valorInicial = leerDecimal();
        System.out.print(" Valor porción de helado  : $");
        double helado = leerDecimal();
        System.out.print(" Valor porción de pastel  : $");
        double pastel = leerDecimal();
        return new MenuNinos(nombre, valorInicial, helado, pastel);
    }

    private static MenuEconomico registrarMenuEconomico() {
        System.out.println("\n=== MENU ECONOMICO ===");
        System.out.print(" Nombre del plato          : ");
        String nombre = sc.nextLine().trim();
        System.out.print(" Valor inicial             : $");
        double valorInicial = leerDecimal();
        System.out.print(" Porcentaje de descuento   : ");
        double descuento = leerDecimal();
        return new MenuEconomico(nombre, valorInicial, descuento);
    }

    // Métodos de lectura con validación
    private static int leerEntero() {
        while (true) {
            try {
                int valor = Integer.parseInt(sc.nextLine().trim());
                return valor;
            } catch (NumberFormatException e) {
                System.out.print(" Ingrese un número entero válido: ");
            }
        }
    }

    private static double leerDecimal() {
        while (true) {
            try {
                double valor = Double.parseDouble(sc.nextLine().trim());
                if (valor < 0) {
                    System.out.print(" El valor no puede ser negativo. Intente: ");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e) {
                System.out.print(" Ingrese un número válido: ");
            }
        }
    }
}