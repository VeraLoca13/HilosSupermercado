package org.vera;

import com.sun.source.tree.TryTree;

import javax.swing.*;

public class CajeraThread extends Thread{
    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public CajeraThread() {
    }

    public CajeraThread(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
    @Override
    public void run(){
        System.out.println("La cajera "+nombre+" empieza a procesar la compra del cliente "
                +this.cliente.getNombre()+" en el tiempo : "+
                (System.currentTimeMillis() - this.initialTime)/1000+" segundos.");
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            this.esperarSegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto "+(i+1)+" del cliente " +
                    cliente.getNombre()+ "-->Timepo: "+
                    (System.currentTimeMillis() - this.initialTime)/1000+" segundos.");
        }
    }
    private void esperarSegundos(int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
