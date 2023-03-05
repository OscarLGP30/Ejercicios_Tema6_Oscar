package org.example;

public class Tabla_Funciones {

    //Escriba una función que cree una tabla que tenga una dimensión de diez números enteros e inicialice aleatoriamente los valores de esta tabla, con valores entre un límite mínimo y un límite máximo, que se pasan como argumentos.

    //Cree una función que devuelva el mayor valor de una tabla (esta tabla no tiene necesariamente diez celdas, etc.).

    //Escriba un algoritmo que llame a estas dos funciones.

    public static void main(String[] args) {
        // TODO code application logic here
        int[] tabla = new int[10];
        int min = 1;
        int max = 100;
        int mayor = 0;
        int posicion = 0;

        tabla = crearTabla(tabla, min, max);
        mostrarTabla(tabla);
        mayor = mayorTabla(tabla, mayor, posicion);
        System.out.println("El mayor valor de la tabla es " + mayor);
    }

    public static int[] crearTabla(int[] tabla, int min, int max){
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return tabla;
    }

    public static void mostrarTabla(int[] tabla){
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("El valor de la posición " + i + " es " + tabla[i]);
        }
    }

    public static int mayorTabla(int[] tabla, int mayor, int posicion){
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
                posicion = i;
            }
        }
        return mayor;
    }


}
