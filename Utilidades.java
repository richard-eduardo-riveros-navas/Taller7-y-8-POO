public class Utilidades {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero");
            return 0;
        }
        return a / b;
    }
}
class PruebaUtilidades {
     static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.sumar(10, 5));
        System.out.println("Resta: " + Utilidades.restar(10, 5));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(10, 5));
        System.out.println("División: " + Utilidades.dividir(10, 5));
        System.out.println("División entre cero: " + Utilidades.dividir(10, 0));
    }
}

