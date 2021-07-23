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
public class HiloAgrupado extends Thread{

    //Contructor ThreadGroup 
    public HiloAgrupado(ThreadGroup group, String name) {
        super(group, name);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion "+i+" de "+getName());
            
        }
        System.out.println("Ha terminado el hilo "+getName());
        
        //El papa es un Thread y necesito mantener el grupo de hilos
        ThreadGroup grupoHilos = new ThreadGroup("Grupo de hilos");
        Thread hilo1 = new HiloAgrupado(grupoHilos,"Hilo 1");
        
        
    }
    
}
