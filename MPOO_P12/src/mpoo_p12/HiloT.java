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
public class HiloT extends Thread{
    //Constructor unicamente con String namee
    public HiloT(String name) {
        super(name);
    }
    
    //Todo lo que quermos que haga nuetro hilo
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            //Iteraciones
            System.out.println("Iteracion "+i+" de "+getName());
        }
        System.out.println("Termina el "+getName());
    }
    
}
