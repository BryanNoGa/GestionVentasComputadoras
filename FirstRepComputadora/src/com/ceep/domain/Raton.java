
package com.ceep.domain;

/**
 *
 * @author braya
 */
public class Raton extends DispositivoEntrada{
    
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntradas, String marca) {
        super(tipoEntradas, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
