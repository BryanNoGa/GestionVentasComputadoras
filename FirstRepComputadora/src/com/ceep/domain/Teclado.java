
package com.ceep.domain;

/**
 *
 * @author braya
 */
public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntradas, String marca) {
        super(tipoEntradas, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
