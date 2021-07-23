/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoo_p12;

/**
 *
 * @author edgarriv69
 */

//NO extiende de Thread implementara runnable
public class HiloR implements Runnable{
    
    //Metodos abstractos necesarios
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion "+i+" de "+
                    //Obtenemos el nombre de thread
                    Thread.currentThread().getName());
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
        
    }
    
    
}
