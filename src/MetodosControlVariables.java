import java.util.Scanner;

public class MetodosControlVariables {
    public static void main(String[] args) {
//    Introducción General
//
//    En la programación, especialmente cuando trabajamos con entradas del usuario,
//    es fundamental asegurar la calidad de los datos. Los usuarios pueden escribir
//    espacios de más, usar mayúsculas o minúsculas inesperadas, o incluso ingresar
//    valores incorrectos. Java ofrece herramientas para:
//
//            ✔ Normalizar texto
//✔ Validar números
//✔ Formatear resultados numéricos
//✔ Manipular cadenas de caracteres
//
//    Dominar estos métodos permite crear programas más robustos, seguros y profesionales.

//    Teoría General
//🔹Manejo de Strings en Java
//
//  Un String es una secuencia de caracteres. Java los trata como objetos, por lo que tienen
//  métodos para manipular, transformar y analizar el texto.
//
//  Entre las operaciones esenciales están:
//
//  Eliminar espacios
//  Convertir mayúsculas/minúsculas
//  Extraer partes del texto
//  Verificar si están vacíos
//  Acceder a un carácter específico
//
//Estas tareas son muy importantes en:
//
//  Formularios
//  Procesamiento de datos
//  Normalización de nombres
//  Comparaciones de texto

//    Validación con Scanner
//
//    Cuando leemos datos con Scanner, no siempre podemos confiar en que el usuario
//    escribirá bien.
//
//    Para evitar errores, Scanner incluye métodos que verifican si la entrada es válida
//    antes de convertirla.
//
//            Ejemplo:
//
//    hasNextInt() → ¿el usuario realmente ingresó un entero?
//
//    hasNextDouble() → ¿la entrada puede convertirse a double?
//
//    Esto ayuda a evitar que el programa se "rompa" por entradas inesperadas.

//      CONTROL DE MAYUSCULAS Y FORMATO DE NOMBRE

        String nombre = "   eSTeBan   ";

// Eliminar espacios
        nombre = nombre.trim();

// Convertir todo a minúsculas
        nombre = nombre.toLowerCase();

// Convertir primera letra a mayúscula
        String nombreFormateado =
                Character.toUpperCase(nombre.charAt(0))
                        + nombre.substring(1);

        System.out.println(nombreFormateado);  // Esteban

//        VALIDACION NUMERICA
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");

        while (!sc.hasNextInt()) {
            System.out.println("Error: ingrese un número entero.");
            sc.next(); // Limpiar entrada incorrecta
        }

        int edad = sc.nextInt();
        System.out.println("Edad registrada: " + edad);

//       FORMATO DE NUMEROS

        double precio = 12.34567;
        String precioFormateado = String.format("%.2f", precio);

        System.out.println("Precio final: $" + precioFormateado);

//        VALIDACION DE STRING VACIO

        String texto = "";

        if (texto.isEmpty()) {
            System.out.println("El texto está vacío");
        }

//        ACCESO A CARACTERES ESPECIFICOS

        String palabra = "Java";
        char primeraLetra = palabra.charAt(0);

        System.out.println("Primera letra: " + primeraLetra);



    }
}
