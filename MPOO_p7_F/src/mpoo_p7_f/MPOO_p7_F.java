/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoo_p7_f;

/**
 *
 * @author edgarriv69
 */
public class MPOO_p7_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                           
    
    
        System.out.println("************COMPROBANDO***********+");
    
        System.out.println("Herencias de Alumno:");
    AlumnoIngenieria alum1 = new AlumnoIngenieria();
        if(alum1 instanceof AlumnoIngenieria){
            System.out.println("Es una instancia de AlumnoIngenieria");
        }if(alum1 instanceof Alumno){
            System.out.println("Sí una instancia de Alumno");
        }if(alum1 instanceof Persona){
            System.out.println("Sí una instancia de Persona");
        }else{
            System.out.println("No es instancia de Alumno");
        }if(alum1 instanceof Object){
            System.out.println("Sí es una instancia de Object");
        }else{
            System.out.println("No es una instancia de Object");
        }
        
        System.out.println("");
        System.out.println("Herencias de Pofesor:");
    ProfesorLaboratorio prof1 = new ProfesorLaboratorio();
        if(prof1 instanceof ProfesorLaboratorio){
            System.out.println("Es una instancia de AlumnoIngenieria");
        }if(prof1 instanceof Profesor){
            System.out.println("Sí una instancia de Alumno");
        }if(prof1 instanceof Persona){
            System.out.println("Sí una instancia de Persona");
        }else{
            System.out.println("No es instancia de Alumno");
        }if(prof1 instanceof Object){
            System.out.println("Sí es una instancia de Object");
        }else{
            System.out.println("No es una instancia de Object");
        }    
        
                    
    }    
    
}
