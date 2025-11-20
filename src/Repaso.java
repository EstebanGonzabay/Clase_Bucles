
//Calculador de operaciones aritmeticas
//Calculador de areas de figuras geometricas

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {

        // suma, resta, multiplicacion y division

        //ingreso de 2 numeros
        //double puedes ingresar diferentes tipos de numeros sean decimales o enteros
        //int puedes ingresar numeros enteros mas no decimales
        //float puedes ingresar numeros decimales pero nunca enteros
//        float numero_uno = 15f;
//        float numero_dos = 10f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESA NUMERO #1: ");
        float numero_uno = scanner.nextFloat();
        System.out.println("INGRESA NUMERO #2: ");
        float numero_dos = scanner.nextFloat();

        while(numero_dos == 0){
            System.out.println("EL NUMERO TIENE QUE SER MAYOR A CERO");
            System.out.println("INGRESE NUEVAMENTE EL NUMERO: ");
            numero_dos = scanner.nextFloat();
        }

        //SUMA
        float suma = numero_dos + numero_uno;

        //RESTA
        float resta = numero_uno - numero_dos;

        //MULTIPLICACION
        float multiplicacion = numero_dos * numero_uno;

        // DIVISION
        float division = numero_uno/numero_dos;

        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("resta = " + resta);
        System.out.println("suma = " + suma);
        System.out.println("division = " + division);

//        if (numero_dos != 0 ){
//            System.out.println("division = " + division);
//        } else {
//            System.out.println("ERROR EL SEGUNDO NUMERO NO PUEDE SER 0");
//        }

    scanner.close();

    }

}
