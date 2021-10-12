package com.ceep.domain;

/**
 *
 * @author braya
 */
public class Orden {
    
    private final int idPedido;
    private Computadora computadores[];
    private static int contadorComputadores;
    private static int contadorPedidos;
    private static final int MAX_COMPUTADORAS = 5;
    
    public Orden(){
        Orden.contadorComputadores = 0;
        this.idPedido = ++Orden.contadorPedidos;
        this.computadores = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputador(Computadora computador){
        if (this.contadorComputadores < Orden.MAX_COMPUTADORAS){
            this.computadores[this.contadorComputadores++] = computador;
        } else {
            System.out.println("Se ha superado el máximo de computadores "
                    + "a comprar" + Orden.MAX_COMPUTADORAS); 
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Id. del pedido: " + this.idPedido);
        for (int i = 0; i < this.contadorComputadores; i++) {
//            System.out.println("Ordenador" + i + " : ");
//            System.out.println("Monitor marca: " +  computadores[i].getMonitor().getMarca());
//            System.out.println("Monitor tamaño: " +  computadores[i].getMonitor().getTamanio());
//            System.out.println("Teclado tipo entrada: " +  computadores[i].getTeclado().getTipoEntrada());
//            System.out.println("Teclado marca: " +  computadores[i].getTeclado().getMarca());
//            System.out.println("Raton tipo entrada: " +  computadores[i].getRaton().getTipoEntrada());
//            System.out.println("Raton marca: " +  computadores[i].getRaton().getMarca());
            System.out.println(this.computadores[i]); // Este objeto ya tiene un método toString
        }
    }
}
