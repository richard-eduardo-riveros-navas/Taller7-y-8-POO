package Ejercicio3;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Muestra nombre y salario
        System.out.println("Departamento: " + departamento);
    }
}
