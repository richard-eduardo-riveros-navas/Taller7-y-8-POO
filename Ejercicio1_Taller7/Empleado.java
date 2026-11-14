package Ejercicio1_Taller7;

public class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salario no válido");
        }
    }
}
class PruebaEmpleado {
    static void main(String[] args) {
        Empleado e1 = new Empleado("Carlos", 150);
        Empleado e2 = new Empleado("Laura", 200);

        System.out.println("Nombre: " + e1.nombre);
        System.out.println("Salario: " + e1.getSalario());

        e1.setSalario(180);
        System.out.println("Nuevo salario de " + e1.nombre + ": " + e1.getSalario());

        e2.setSalario(-50);
        System.out.println("Salario de " + e2.nombre + ": " + e2.getSalario());
    }
}

