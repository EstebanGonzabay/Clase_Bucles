import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el límite máximo de productos a registrar:");
        int limite = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        float totalIVA = 0;
        float totalIMC = 0;
        float totalVentas = 0;
        int contadorProductos = 0;

        while (contadorProductos < limite) {

            System.out.println("\nIngrese el nombre del producto:");
            String nombre = scanner.nextLine();

            // Validación del precio
            double precio;
            do {
                System.out.println("Ingrese el precio base del producto:");
                precio = scanner.nextDouble();
                if (precio < 0) {
                    System.out.println("El precio no puede ser negativo. Intente nuevamente.");
                }
            } while (precio < 0);

            // Validación IVA
            int opcionIVA;
            do {
                System.out.println("¿El producto tiene IVA? (1 = sí, 0 = no):");
                opcionIVA = scanner.nextInt();
                if (opcionIVA != 1 && opcionIVA != 0) {
                    System.out.println("Opción inválida. Solo ingrese 1 o 0.");
                }
            } while (opcionIVA != 1 && opcionIVA != 0);

            // Cálculo del IVA
            double iva = (opcionIVA == 1) ? precio * 0.12 : 0;

            // Cálculo del IMC (Impuesto Municipal de Control)
            double imc = precio * 0.015;

            double precioFinal = precio + iva + imc;

            // Acumular totales
            totalIVA += iva;
            totalIMC += imc;
            totalVentas += precioFinal;

            contadorProductos++;

            // Limpiar buffer antes de leer cadenas nuevamente
            scanner.nextLine();

            // Mostrar resumen del producto
            System.out.println("--------------------------------");
            System.out.println("Producto: " + nombre);
            System.out.println("Precio base: " + precio);
            System.out.println("IVA aplicado: " + iva);
            System.out.println("IMC aplicado: " + imc);
            System.out.println("Precio final: " + precioFinal);
            System.out.println("--------------------------------");
        }

        // Resumen final
        System.out.println("\n======= RESUMEN DEL DÍA =======");
        System.out.println("Productos registrados: " + contadorProductos);
        System.out.println("Total recaudado en IVA: " + totalIVA);
        System.out.println("Total recaudado en IMC: " + totalIMC);
        System.out.println("Monto total de ventas: " + totalVentas);
        System.out.println("================================");

        scanner.close();
    }
}
