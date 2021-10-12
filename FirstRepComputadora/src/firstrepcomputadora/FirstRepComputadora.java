package firstrepcomputadora;

import com.ceep.domain.*;

/**
 *
 * @author braya
 */
public class FirstRepComputadora {

    
    public static void main(String[] args) {
        
        Orden orden1 = new Orden();
        // Al tener una relación de agregación podremos tener objetos 
        // de monitor, raton y teclado independientemente de tener Computadores.
        Monitor monitor1 = new Monitor("Dell",21.0);
        Raton raton1 = new Raton("USB", "Logitech");
        Teclado teclado1 = new Teclado("Micro-USB", "Apple");
                        
        Computadora computador1 = new Computadora("Híbrido", monitor1, teclado1, raton1);
        orden1.agregarComputador(computador1);
        orden1.mostrarOrden();
    }
    
}
