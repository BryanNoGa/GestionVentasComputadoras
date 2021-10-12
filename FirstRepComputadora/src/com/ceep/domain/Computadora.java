package com.ceep.domain;
/**
 *
 * @author braya
 */
public class Computadora {
    
    private final int idComputador;
    private String Nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadores;

    public Computadora() {
        idComputador = ++Computadora.contadorComputadores;
    }

    public Computadora(String Nombre, Monitor monitor, Teclado teclado, 
            Raton raton) {
        this();
        this.Nombre = Nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
    
    public int getIdComputador() {
        return idComputador;
    }    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computador{idComputador=").append(idComputador);
        sb.append(", Nombre=").append(Nombre);
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append('}');
        return sb.toString();
    }

    
    
}
