/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto_mpoo;
/* import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.*; */
import java.util.Scanner;
/**
 *
 * @author edgarriv69
 */

public class PROYECTO_MPOO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   /*  Alumno alumno1 = new Alumno(); */
    
        
    Scanner e = new Scanner(System.in);
    System.out.println("Seleccione la opción deseada:");
    System.out.println("1: Registro  de nombres.");
    System.out.println("2: Registro de un alumno (datos personales).");
    System.out.println("3: Generador de registros académicos.");
    System.out.println("4: CRUD");
    System.out.println("5: Registro de todas las direcciones.\n");
    int num = e.nextInt();
    switch (num){
        case 1:              
            Alumno.generarAlumnos();
            break;
        
        case 2:
            System.out.println("El alumno...");
            Alumno.datosPersonales();
            System.out.println("////////////////////");
            System.out.println("MATERIAS INSCRITAS: ");
            Alumno.generarMaterias();
            Alumno.generarProm();
            e.close();
            break;
        
        case 3:
            System.out.println("El alumno...");

            break;
        
        case 4:
            System.out.println("\n--- CRUD ---");
            System.out.println("Seleccione la opción deseada:");
            System.out.println("1: Crear registro");
            System.out.println("2: Buscar alumno por número de cuenta");
            System.out.println("3: Actualizar materias del alumno");
            System.out.println("4: Eliminar un registro\n");
            num = e.nextInt();
            switch (num) {
                case 2:
                    System.out.print(" ---Ingrese el número de cuenta: ");
                    CRUD.read(e.next().trim());
                    e.close();
                    break;
            
                default:
                    System.out.println("Por el momento no está disponible esta opción...");
                    e.close();
                    break;
            }
            break;
            
        case 5:
            Alumno.leerDirecciones();
            break;
                
        default:
            System.out.println("No existe esa opción.");
        }
   
    }
}