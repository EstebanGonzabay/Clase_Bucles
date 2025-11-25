import java.util.Scanner;

public class Tienda_Buen_Sabor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // PARA LA FACTURA NOMBRE, PRECIO, IVA, IMC, PRECIO FINAL
        System.out.println("INGRESA LA CANTIDAD DE PRODUCTOS A TRABAJAR\n");
        int limite = scanner.nextInt();

        int contadorProductos = 0;
        int totalIVA = 0;
        int totalIMC = 0;
        int totalVentas = 0;

        while(contadorProductos < limite ){

            System.out.println("USTED VA A INGRESAR " + limite + " PRODUCTOS" );
//            String nombre = "Leche";

            System.out.println("INGRESE NOMBRE DEL PRODUCTO\n");
            String nombre = scanner.nextLine();

            if(!nombre.trim().isEmpty()){
                nombre = nombre.trim().toLowerCase();
                nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1);
            }

            //  E S T E B A N
            // E

            // mientras el precio sea positivo el programa va a funcionar
            double precio;

            do{
                System.out.println("Ingrese el precio del producto");
                precio = scanner.nextDouble();
                if(precio < 0 ){
                    System.out.println("EL PRECIO DEL PRODUCTO NO ES NEGATIVO: INTENTE NUEVAMENTE\n");
                }
            } while (precio < 0);

            int opcionIVA;

            do{
                System.out.println("¿El producto tiene iva? (1 == Si, 0 == No)");
                opcionIVA = scanner.nextInt();

                if(opcionIVA != 1 && opcionIVA !=0){
                    System.out.println("Opcion invalidad. Solo ingrese 1 o 0");
                }
            } while (opcionIVA != 1 && opcionIVA !=0);

            double iva = (opcionIVA == 1)? precio * 0.15 : 0;
            double imc = precio * 0.15;
            double precioFinal = precio + iva + imc;

            System.out.println("nombre = " + nombre);
            System.out.println("precio = " + precio);
            System.out.println("iva = " + iva);
            System.out.println("imc = " + imc);
            System.out.println("precioFinal = " + precioFinal);

            //ACUMULADOR
            totalIVA += iva;
            totalIMC += imc;
            totalVentas += precioFinal;

            contadorProductos ++;

        }

        System.out.println("PRODUCTOS REGISTRADOS");
        System.out.println("contadorProductos = " + contadorProductos);
        System.out.println("totalIVA = " + totalIVA);
        System.out.println("totalIMC = " + totalIMC);
        System.out.println("totalVentas = " + totalVentas);

        scanner.close();

////        double iva = 0.15;
////        double imc = 0.15;
////
////
////        double precioConIVA = precio*iva;
////        double precioConIMC = precio*imc;
//
//        double precioFinal = precio + precioConIVA + precioConIMC;
//
//        System.out.println("nombre = " + nombre);
//        System.out.println("precio = " + precio);
//        System.out.println("precioConIMC = " + precioConIMC);
//        System.out.println("precioConIVA = " + precioConIVA);
//        System.out.println("precioFinal = " + precioFinal);

    }
}
