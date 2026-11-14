package Errores;

public class ErroresHerencia {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DEL EJERCICIO 4: ERRORES DE HERENCIA ===");
        
        CocheHijo miCoche = new CocheHijo();
        miCoche.mostrarMarca();
    }
}

// =========================================================================
// PARTE 1: Clases para demostrar el error por Herencia Múltiple
// =========================================================================

class ClaseA {
   void metodoA() {
        System.out.println("Método de la Clase A");
    }
}

class ClaseB {
    void metodoB() {
        System.out.println("Método de la Clase B");
    }
}

/* 
 * ERROR DE COMPILACIÓN (Herencia Múltiple):
 * Si intentaras descomentar el siguiente bloque, Java daría error.
 * Una clase en Java no puede heredar de múltiples clases a la vez (no existe "extends ClaseA, ClaseB").
 */
/*
class ClaseC extends ClaseA, ClaseB {
    // Esto no compila
}
*/


// =========================================================================
// PARTE 2: Clases para demostrar el error por Acceso a Atributos Privados
// =========================================================================

class VehiculoBase {
    // Atributo privado de la clase base (padre)
    private String marcaSecreta = "Toyota"; 
}

class CocheHijo extends VehiculoBase {
    public void mostrarMarca() {
        /* 
         * ERROR DE COMPILACIÓN (Acceso Privado):
         * Los atributos 'private' no son accesibles directamente desde la clase hija.
         * La línea de abajo se mantiene comentada para que el proyecto compile bien.
         * Descoméntala un segundo si necesitas ver el error en rojo para tu PDF.
         */
        
        //System.out.println(marcaSecreta); // Esto arroja el error de acceso privado
        
        System.out.println("No se puede acceder directamente al atributo privado por seguridad.");
    }
}
