package Ejercicio4;

public class ErroresHerencia {
 // ==========================================
// PARTE 1: Error por Herencia Múltiple
// ==========================================

class ClaseA {
    // Atributos o métodos de la clase A
}

class ClaseB {
    // Atributos o métodos de la clase B
}

// ERROR DE COMPILACIÓN: 
// En Java, una clase NO puede heredar de múltiples clases a la vez (no se permite herencia múltiple de clases).
/*
public class ClaseC extends ClaseA, ClaseB {
    // Esto genera error: "extended modifier not allowed" o sintaxis inválida
}
*/

// ==========================================
// PARTE 2: Error por Acceso a Atributos Privados
// ==========================================

class VehiculoBase {
    // Atributo privado de la clase base (padre)
    private String marcaSecreta = "Toyota"; 
}

class CocheHijo extends VehiculoBase {
    public void mostrarMarca() {
        // ERROR DE COMPILACIÓN:
        // Los atributos 'private' de la clase base NO son accesibles directamente desde la clase derivada.
        //System.out.println(marcaSecreta); // Esto arroja el error: "'marcaSecreta' has private access in 'VehiculoBase'"
        
        System.out.println("No se puede acceder directamente al atributo privado por seguridad[cite: 10, 11].");
    }
}
}
