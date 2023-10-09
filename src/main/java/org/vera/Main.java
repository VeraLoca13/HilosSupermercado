package org.vera;

import javax.naming.InitialContext;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1",new int[]{2,3,4,5,1});
        Cliente cliente2 = new Cliente("Cliente 2",new int[]{9,3,6,2,8,1});
        Cliente cliente3 = new Cliente("Cliente 3",new int[]{1,6,7,9,2});
        long initialTime=System.currentTimeMillis();
        CajeraThread cajera1 = new CajeraThread("Cajera1",cliente1, initialTime);
        CajeraThread cajera2 = new CajeraThread("Cajera2", cliente2, initialTime);
        CajeraThread cajera3 = new CajeraThread("Cajera3", cliente3, initialTime);

        cajera1.start();
        cajera2.start();
        cajera3.start();

    }
}