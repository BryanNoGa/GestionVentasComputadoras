package com.ceep.domain;

/**
 *
 * @author braya
 */
public class Monitor {
        
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    public Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamanio=").append(tamanio);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
        
}

