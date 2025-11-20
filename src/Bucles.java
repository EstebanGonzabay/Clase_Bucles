import java.util.Scanner;
public class Bucles {
    public static void main(String[] args) {

//    1. Bucle FOR
//    Concepto: Se utiliza cuando sabemos exactamente cuántas veces queremos que se repita el código.

//  ESTRUCTURA
// for (inicialización; condición; actualización) {
//        // código a repetir
//    }

    // Imprimir números del 1 al 5
//for (int i = 1; i <= 5; i++) {
//    System.out.println("Número: " + i);
//}

//// Resultado:
//// Número: 1
//// Número: 2
//// Número: 3
//// Número: 4
//// Número: 5

//        2. Bucle WHILE
//Concepto: Se ejecuta mientras la condición sea verdadera.
//
//Estructura:

//        while (condición) {
//    código a repetir
//}

        //EJEMPLO

        // Contador hasta llegar a 5
int contador = 1;
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++; // Incrementar el contador
}

//// Resultado:
//// Contador: 1
//// Contador: 2
//// Contador: 3
//// Contador: 4
//// Contador: 5


//        3. Bucle DO WHILE
//Concepto: Ejecuta el código al menos una vez, luego verifica la condición.
//
//Estructura:

//        do {
//    // código a repetir
//} while (condición);



// Pedir un número hasta que sea positivo
Scanner scanner = new Scanner(System.in);
int numero;

do {
    System.out.print("Ingresa un número positivo: ");
    numero = scanner.nextInt();
    System.out.println("Has ingresado: " + numero);

    if (numero <= 0) {
        System.out.println("¡El número debe ser positivo! Intenta de nuevo.");
    }
} while (numero <= 0);

System.out.println("¡Perfecto! " + numero + " es positivo.");

//// Ejemplo de ejecución:
//// Ingresa un número positivo: -3
//// Has ingresado: -3
//// ¡El número debe ser positivo! Intenta de nuevo.
//// Ingresa un número positivo: 5
//// Has ingresado: 5
//// ¡Perfecto! 5 es positivo.


    }
}
