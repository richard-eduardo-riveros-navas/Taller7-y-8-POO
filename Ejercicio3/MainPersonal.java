package Ejercicio3;

public class MainPersonal {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos", 1500000);
        Gerente ger = new Gerente("Ana", 3500000, "Sistemas");

        System.out.println("--- Empleado ---");
        emp.mostrarDetalles();

        System.out.println("\n--- Gerente ---");
        ger.mostrarDetalles();
    }
}
