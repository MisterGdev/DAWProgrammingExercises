package circulacion;

//Aplicacion.java
public class Aplicacion {
 public static void main(String[] args) {

     System.out.println("=== SIMULACIÓN DE SEMÁFOROS ===\n");

     // Crear dos semáforos
     Semaforo semaforo1 = new Semaforo();
     Semaforo semaforo2 = new Semaforo();

     // --- SEMÁFORO 1 ---
     System.out.println(">> SEMÁFORO 1");
     semaforo1.darPaso();
     semaforo1.mostrarEstado();

     semaforo1.prohibirPaso();
     semaforo1.mostrarEstado();

     semaforo1.apagar();
     semaforo1.mostrarEstado();

     System.out.println("\n-----------------------------\n");

     // --- SEMÁFORO 2 ---
     System.out.println(">> SEMÁFORO 2");
     semaforo2.prohibirPaso();
     semaforo2.mostrarEstado();

     semaforo2.darPaso();
     semaforo2.mostrarEstado();

     semaforo2.apagar();
     semaforo2.mostrarEstado();

     System.out.println("\n=== SIMULACIÓN FINALIZADA ===");
 }
}
