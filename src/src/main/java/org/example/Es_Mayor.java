package org.example;

public class Es_Mayor {

    //Escriba una función que tome dos valores reales como argumentos y devuelva el mayor de los dos; Escriba otra función que también tome dos valores reales como argumentos, pero que devuelva: 1. 0 si los dos valores son iguales, 2. 1 si el primer valor es mayor que el segundo, 3. -1 si el primer valor es menor que el segundo, y escriba un programa que utilice estas dos funciones.


    public static void main(String[] args) {
        // TODO code application logic here
        double a = 5;
        double b = 10;
        double c = 5;
        double d = 5;
        double e = 10;
        double f = 5;
        double g = 10;
        double h = 10;
        double i = 10;
        double j = 5;
        double k = 10;
        double l = 10;
        double m = 5;
        double n = 10;
        double o = 5;
        double p = 10;
        double q = 5;
        double r = 10;
        double s = 5;
        double t = 10;
        double u = 5;
        double v = 10;
        double w = 5;
        double x = 10;
        double y = 5;
        double z = 10;

        System.out.println("El mayor de " + a + " y " + b + " es " + mayor(a, b));
        System.out.println("El mayor de " + c + " y " + d + " es " + mayor(c, d));
        System.out.println("El mayor de " + e + " y " + f + " es " + mayor(e, f));
        System.out.println("El mayor de " + g + " y " + h + " es " + mayor(g, h));
        System.out.println("El mayor de " + i + " y " + j + " es " + mayor(i, j));
        System.out.println("El mayor de " + k + " y " + l + " es " + mayor(k, l));
        System.out.println("El mayor de " + m + " y " + n + " es " + mayor(m, n));
        System.out.println("El mayor de " + o + " y " + p + " es " + mayor(o, p));
        System.out.println("El mayor de " + q + " y " + r + " es " + mayor(q, r));
        System.out.println("El mayor de " + s + " y " + t + " es " + mayor(s, t));
        System.out.println("El mayor de " + u + " y " + v + " es " + mayor(u, v));
        System.out.println("El mayor de " + w + " y " + x + " es " + mayor(w, x));
        System.out.println("El mayor de " + y + " y " + z + " es " + mayor(y, z));

        System.out.println("El mayor de " + a + " y " + b + " es " + mayor2(a, b));
        System.out.println("El mayor de " + c + " y " + d + " es " + mayor2(c, d));
        System.out.println("El mayor de " + e + " y " + f + " es " + mayor2(e, f));
        System.out.println("El mayor de " + g + " y " + h + " es " + mayor2(g, h));
        System.out.println("El mayor de " + i + " y " + j + " es " + mayor2(i, j));
        System.out.println("El mayor de " + k + " y " + l + " es " + mayor2(k, l));
        System.out.println("El mayor de " + m + " y " + n + " es " + mayor2(m, n));
        System.out.println("El mayor de " + o + " y " + p + " es " + mayor2(o, p));
        System.out.println("El mayor de " + q + " y " + r + " es " + mayor2(q, r));
        System.out.println("El mayor de " + s + " y " + t + " es " + mayor2(s, t));
        System.out.println("El mayor de " + u + " y " + v + " es " + mayor2(u, v));
        System.out.println("El mayor de " + w + " y " + x + " es " + mayor2(w, x));
        System.out.println("El mayor de " + y + " y " + z + " es " + mayor2(y, z));







}

    private static String mayor2(double a, double b) {
        if (a > b) {
            return String.valueOf(1);
        } else if (a < b) {
            return String.valueOf(-1);
        } else {
            return String.valueOf(0);
        }
    }

    private static String mayor(double a, double b) {
        if (a > b) {
            return String.valueOf(a);
        } else {
            return String.valueOf(b);
        }
    }
    }


