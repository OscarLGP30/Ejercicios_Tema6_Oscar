package org.example;

public class Taller_Ascii {

    //Escribir un algoritmo para hacer dibujos en arte ASCII. El diseño está modelizado por una tabla de caracteres de diez líneas y cuarenta columnas. Inicialmente, esta tabla contiene solo caracteres de espacio. Un procedimiento debe llevar a cabo la visualización de la obra.

    //Cuando se inicia el programa, se muestra el dibujo y, a continuación, un menú ofrece realizar una de las siguientes funciones:

    //Dibujar un carácter.
    //Dibujar un rectángulo con un conjunto de caracteres.

   //Cambiar "el color" (es decir, el carácter), usando un bote de pintura (puede inspirarse en lo que se presentó en la sección que trata sobre la recursividad).

    //Cada una de las funciones mencionadas se debe realizar utilizando uno o más procedimientos.

    public static void main(String[] args) {
        // TODO code application logic here
        char[][] tabla = new char[10][40];
        char caracter = ' ';
        int x = 0;
        int y = 0;
        int ancho = 0;
        int alto = 0;
        char color = ' ';
        char colorNuevo = ' ';
        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int opcion4 = 0;
        int opcion5 = 0;
        int opcion6 = 0;
        int opcion7 = 0;
        int opcion8 = 0;
        int opcion9 = 0;
        int opcion10 = 0;

        tabla = crearTabla(tabla, caracter);
        mostrarTabla(tabla);
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Dibujar un carácter.");
        System.out.println("2. Dibujar un rectángulo con un conjunto de caracteres.");
        System.out.println("3. Cambiar el color.");
        opcion = leerOpcion(opcion);
        switch (opcion) {
            case 1:
                System.out.println("¿Qué carácter desea dibujar?");
                caracter = leerCaracter(caracter);
                System.out.println("¿En qué posición desea dibujar el carácter?");
                System.out.println("Posición en X:");
                x = leerOpcion(x);
                System.out.println("Posición en Y:");
                y = leerOpcion(y);
                tabla = dibujarCaracter(tabla, caracter, x, y);
                mostrarTabla(tabla);
                break;
            case 2:
                System.out.println("¿Qué carácter desea dibujar?");
                caracter = leerCaracter(caracter);
                System.out.println("¿En qué posición desea dibujar el carácter?");
                System.out.println("Posición en X:");
                x = leerOpcion(x);
                System.out.println("Posición en Y:");
                y = leerOpcion(y);
                System.out.println("¿Cuál es el ancho del rectángulo?");
                ancho = leerOpcion(ancho);
                System.out.println("¿Cuál es el alto del rectángulo?");
                alto = leerOpcion(alto);
                tabla = dibujarRectangulo(tabla, caracter, x, y, ancho, alto);
                mostrarTabla(tabla);
                break;
            case 3:
                System.out.println("¿Qué carácter desea cambiar?");
                color = leerCaracter(color);
                System.out.println("¿Por qué carácter desea cambiarlo?");
                colorNuevo = leerCaracter(colorNuevo);
                tabla = cambiarColor(tabla, color, colorNuevo);
                mostrarTabla(tabla);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

}

    private static char[][] cambiarColor(char[][] tabla, char color, char colorNuevo) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] == color) {
                    tabla[i][j] = colorNuevo;
                }
            }
        }
        return tabla;
    }

    private static char[][] dibujarRectangulo(char[][] tabla, char caracter, int x, int y, int ancho, int alto) {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                tabla[y][x] = caracter;
                x++;
            }
            y++;
            x = x - ancho;
        }
        return tabla;
    }

    private static char[][] dibujarCaracter(char[][] tabla, char caracter, int x, int y) {
        tabla[y][x] = caracter;
        return tabla;
    }

    private static char leerCaracter(char caracter) {
        caracter = Taller_Ascii.datoChar();
        return caracter;
    }

    private static char datoChar() {
        return 0;
    }


    private static int leerOpcion(int opcion) {
        opcion = Taller_Ascii.datoInt();
        return opcion;
    }

    private static int datoInt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void mostrarTabla(char[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]);
            }
            System.out.println("");
        }
    }

    private static char[][] crearTabla(char[][] tabla, char caracter) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = caracter;
            }
        }
        return tabla;
    }
    }
