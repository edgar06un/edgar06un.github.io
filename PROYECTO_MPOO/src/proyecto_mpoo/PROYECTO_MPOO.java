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
import static java.lang.System.in;
import java.util.Arrays;
import java.util.Scanner;
import static proyecto_mpoo.CRUD.create;
import static proyecto_mpoo.CRUD.delete;
import static proyecto_mpoo.CRUD.read;
import static proyecto_mpoo.CRUD.update;
/**
 *
 * @author edgarriv69
 */

public class PROYECTO_MPOO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///////////
        Boolean bandera = true;

        Scanner e,e1,e5;
        int num,num1,num3;
        while(bandera){
            e = new Scanner(System.in);
            e1 = new Scanner(System.in);
            e5 = new Scanner(System.in);
            System.out.println("Seleccione la opción deseada:");
            System.out.println("1: Crear alumno de forma aleatoria.");
            System.out.println("2: Modulo CRUD");
            System.out.println("3: Registro de DIRECCIONES.");
            System.out.println("4: Registro de INSCRIPCIONES.");
            System.out.println("Cualquier otro número para salir\n");
            num = e.nextInt();
            
            float promedio1;
                    int numCuenta1;
                    String[] materias1;
                    String nombreCompleto1, direccion1, edad1, sNumIns1;
                    Alumno a1 = new Alumno(); 
       
            switch (num) {
                case 1:
                    
                    // CREACION DE DATOS PERSONALES
                    nombreCompleto1 = a1.nombres(a1);
                    edad1 = a1.edad(a1);
                    numCuenta1 = a1.generarnumCuenta(a1);
                    direccion1 = a1.direccion(a1);
                    materias1 = a1.generarMaterias(a1);
                    
                    // Pasar int a String 
                    String sCuenta1 = Integer.toString(numCuenta1);
                    
                    
                    System.out.println("Nombre: "+nombreCompleto1);
                    System.out.println("Edad: " + edad1);
                    System.out.println("Num Cuenta: " + numCuenta1);
                    System.out.println("Direccion: " + direccion1);
                    System.out.println("Materias: " + Arrays.toString(materias1));
                    sNumIns1 = a1.generarincrip(a1);                   
                    System.out.println("\n");
                    
                    System.out.println("¿Desea agregarlo al registro?");
                    System.out.println("1: Si");
                    System.out.println("Cualquier otro número: No");
                    num3 = e5.nextInt();
                    
                    switch(num3){
                        case 1:                       
                        create(sCuenta1, nombreCompleto1, edad1, direccion1, sNumIns1 ,materias1);
                            break;  
                     
                        default:
                                System.out.println("Valor incorrecto.");
                                break;
                    }
                    
                    break;
                    
                    
                    
                case 2:
                    System.out.println("Seleccione la opción deseada:");
                    System.out.println("1: Crear alumno de forma manual");
                    System.out.println("2: Buscar alumno");
                    System.out.println("3: Actualizar datos del alumno");
                    System.out.println("4: Eliminar alumno");
                    System.out.println("Cualquier otro número para salir\n");
                    num1 = e1.nextInt();
                    
                    
                    switch (num1) {
                            case 1:
                                                           
                            System.out.println("\n----- create(), crear alumno -----\n");
                                                        
                            System.out.println("Ingrese el nombre:");
                            Scanner in = new Scanner(System.in);
                            String nombreM = in.nextLine();
                            System.out.println("Ingrese número de Cuenta:");
                            String numCM = in.nextLine();
                            System.out.println("Ingrese la edad:");
                            String edadM = in.nextLine();
                            System.out.println("Ingrese la direccion:");
                            String direcM = in.nextLine();
                            
                            System.out.println("Ingrese la Materia 1:");
                            String m1 = in.nextLine();
                             System.out.println("Ingrese la Materia 2:");
                            String m2 = in.nextLine();
                             System.out.println("Ingrese la Materia 3:");
                            String m3 = in.nextLine();
                             System.out.println("Ingrese la Materia 4:");
                            String m4 = in.nextLine();
                             System.out.println("Ingrese la Materia 5:");
                            String m5 = in.nextLine();
                             
                            String[] materiasM = {m1,m2,m3,m4,m5};
                            
                            create(numCM,nombreM, edadM, direcM, "106",materiasM);
                            System.out.println("\n----- ----- ----- ----- ----- -----\n");
                                break;
                                
                                
                            case 2:
                                System.out.println("\n----- read(), buscar alumno -----\nPor favor ingresa la cuenta: ");
                                Scanner e3 = new Scanner(System.in);
                                String busqueda = e3.nextLine().trim();

                                read(busqueda);
                                System.out.println("\n----- ----- ----- ----- ----- -----\n");                    
                                break;
                                
                                
                                
                            case 3:
                                System.out.println("\n----- update(), actualizar alumno -----\n");
                                
                                Integer[] materiasACambiar = {1,2,3,4,5};
                                Scanner in1 = new Scanner(System.in);
                                
                                
                                System.out.println("Buscar número de Cuenta:");
                                String nC = in1.nextLine();
                                System.out.println("Nuevo nombre:");
                                String nomN = in1.nextLine();
                                System.out.println("Nueva Edad:");
                                String edN = in1.nextLine();
                                System.out.println("Nueva Dirección:");
                                String dirN = in1.nextLine();
                                
                                
                                System.out.println("Ingrese la Materia 1:");
                                String mCambio1 = in1.nextLine();
                                System.out.println("Ingrese la Materia 2:");
                                String mCambio2 = in1.nextLine();
                                System.out.println("Ingrese la Materia 3:");
                                String mCambio3 = in1.nextLine();
                                System.out.println("Ingrese la Materia 4:");
                                String mCambio4 = in1.nextLine();
                                System.out.println("Ingrese la Materia 5:");
                                String mCambio5 = in1.nextLine();
                                
                                String[] materiasNuevas = {mCambio1,mCambio2,mCambio3,mCambio4,mCambio5};

                              
                                update(nC,nomN,edN,dirN, materiasACambiar, materiasNuevas);
                                System.out.println("\n----- ----- ----- ----- ----- -----\n");
                                break;
                                
                                
                                
                            case 4:
                                System.out.println("\n----- delete(), eliminar alumno -----\n");
                                
                                Scanner in2 = new Scanner(System.in);                                
                                System.out.println("Ingrese número de cuenta::");
                                String eliminar1 = in2.nextLine();
                                delete(eliminar1);
                                System.out.println("Usuario eliminado.");
                                System.out.println("\n----- ----- ----- ----- ----- -----\n");
                                break;

                            default:
                                System.out.println("Valor incorrecto.");
                                break;
                        }                   
                    break;
                    
                    
                case 3:
                    Alumno.leerDirecciones();
                    System.out.println("\n");
                    break;
                    
                case 4:
                    Alumno.leerRegistro();
                    System.out.println("\n");
                    break;
              
                 
                default:
                    bandera = false;
                    e.close();
                    break;
            }
            if(!bandera) e.close();
        }
        System.out.println("\n----- Hasta pronto -----");
        
        
    }
}