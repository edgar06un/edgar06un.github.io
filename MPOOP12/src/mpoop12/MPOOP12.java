/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop12;

/**
 *
 * @author vsanchez
 */
public class MPOOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /*HiloT hiloT1 = new HiloT("Primer hilo");
        hiloT1.start();
        
        new HiloT("Segundo hilo").start();
        
        System.out.println("Termina el hilo principal");
        */
       /*
        System.out.println("/////////////Runnable/////////");
        new Thread(new HiloR(),"Primer hilo").start();
        new Thread(new HiloR(),"Segundo hilo").start();
        System.out.println("Termina el hilo principal");
        */
       
        System.out.println("////////////ThreadGroup///////////");
        
        ThreadGroup grupoHilos = new ThreadGroup("Grupo de hilos");
        Thread hilo1 = new HiloAgrupado(grupoHilos,"Hilo 1");
        Thread hilo2 = new HiloAgrupado(grupoHilos,"Hilo 2");
        Thread hilo3 = new HiloAgrupado(grupoHilos,"Hilo 3");
        Thread hilo4 = new HiloAgrupado(grupoHilos,"Hilo 4");
        Thread hilo5 = new HiloAgrupado(grupoHilos,"Hilo 5");
        
        System.out.println("Prioridad del grupo = "+grupoHilos.getMaxPriority());
        hilo3.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
        System.out.println("Prioridad del grupo = "+grupoHilos.getMaxPriority());
        
        System.out.println("Prioridad del Thread 1 = "+hilo1.getPriority());
        System.out.println("Prioridad del Thread 2 = "+hilo2.getPriority());
        System.out.println("Prioridad del Thread 3 = "+hilo3.getPriority());
        System.out.println("Prioridad del Thread 4 = "+hilo4.getPriority());
        System.out.println("Prioridad del Thread 5 = "+hilo5.getPriority());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        


    //listarHilos(grupoHilos);
    }

    private static void listarHilos(ThreadGroup grupoHilos) {
        int numHilos;
        Thread[] listaDeHilos;
    try{
        numHilos = grupoHilos.activeCount();
        listaDeHilos= new Thread[numHilos];
        grupoHilos.enumerate(listaDeHilos);
        System.out.println("Hilos activos = "+numHilos);
        
        for (int i = 0; i < numHilos; i++) {
            System.out.println("Hilo activo en pos "+i+" = "+
                    listaDeHilos[i].getName());
        }
    }catch(NullPointerException npe){
        System.out.println("Error! los hilos terminaron antes de tiempo");
    }

    }
    
   
}
