/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mpoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgarriv69
 */
public class Alumno {
    
    //Variables para asignar el número de inscripción:
    
    
    String[] asignaturas= new String[]{"Álgebra", "Cálculo y Geometría Analítica", "Química", "Redacción y Exposición de Temas de Ingeniería", "Fundamentos de Programación", 
            "Álgebra Lineal", "Cálculo Integral", "Mecánica", "Cultura y Comunicación", "Estructura de Datos y Algoritmos I", 
            "Termodinámica", "Cálculo Vectorial", "Ecuaciones Diferenciales", "Optativa de Competencias Profesionales", "Modelos de Progrmación Orientada a Objetos", 
            "Probabilidad", "Electricidad y Magnetismo", "Análisis Numérico", "Análisis de Sistemas y Señales", "Costos y Evaluación de Proyectos", 
            "Estadística", "Acústica y Óptica", "Dinámica de Sistemas Físicos", "Análisis de Circuitos Eléctricos", "Energía e Impacto Ambiental", 
            "Introducción a la Economía", "Teoría Electromagnética", "Fundamentos de Control", "Dispositivos y Circuitos Electrónicos", "Maquinas Eléctricas I",
            "Medición e Intrumentación", "Diseño Digital", "Sistemas de Comunicación Electrónicas", "Amplificadores Electrónicos", "Sistemas Eléctricos de Potencia I",
            "Automatización", "Microprocesadores y Microcontroladores", "Procesamiento Digital de Señales", "Instalaciones Eléctricas", "Circuitos Integrados Analógicos",
            "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Subestaciones Eléctricas", "Electrónica de Potencia",
            "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Plantas Generadoras", "Recursos y Necesidades de México"};

    

    
    
    /*public float numInscripcion(){
        return promedio*((asigAprob/asigIns)*100)*((creditoAlum/creditoIngreso)*100);
    }*/
    
  
    //********** MÓDULO GENERADOR DE DATOS PERSONALES ************//
   
    public static void datosPersonales(){
        
        String[] nPropio= new String[]{"Sofía", "Margarita", "Dulce", "Ximena", "Andrea", "Raúl", "Diego", "Daniel", "Iker", "Fernando",
        "Luna", "Regina", "Renata", "Mariana", "Samantha", "Carlos", "Rodrigo", "Mateo", "Pablo", "José"};
        String[] ape = new String[]{"Hernández", "García", "Martínez", "López", "González", "Pérez", "Rodríguez", "Sánchez", "Ramírez",
        "Cruz", "Flores", "Gómez", "Díaz", "Torres", "Guerrero", "Mondragón", "Pineda", "Toledo", "Rivera", "Medina"};
        
            int n = (int) (Math.random() * (20 - 0)) + 0; //Valor para nombre
            int m = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 1
            int o = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 2
            int aleatorio_edad = 0;
            int numLineas = 1;
            int contador = 0;
            
        //Construcción de un nombre con edad
            aleatorio_edad = (int)(Math.random()*(27-18+1)+18);
        
            String nombre = nPropio[n];
            String apellido = ape[m] + " " + ape[o];              
            System.out.println("Nombre: "+nombre + " " + apellido );      
            System.out.println("Edad: "+ aleatorio_edad+ " años " );

            
        //DIRECCIONES
        try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            FileReader fr = new FileReader("direcciones.txt");
            br = new BufferedReader(fr);
            //System.out.println("El texto contenido en el archivo es: ");
            String linea = br.readLine();
            while(linea != null && contador<numLineas){
                System.out.println("Dirección: "+linea);
                linea = br.readLine();
                contador ++;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //********** MÓDULO GENERADOR DE MATERIAS ************//
    
    public static void generarMaterias(){
    
        String[] materias= new String[]{"Álgebra", "Cálculo y Geometría Analítica", "Química", "Redacción y Exposición de Temas de Ingeniería", "Fundamentos de Programación", 
            "Álgebra Lineal", "Cálculo Integral", "Mecánica", "Cultura y Comunicación", "Estructura de Datos y Algoritmos I", 
            "Termodinámica", "Cálculo Vectorial", "Ecuaciones Diferenciales", "Optativa de Competencias Profesionales", "Modelos de Progrmación Orientada a Objetos", 
            "Probabilidad", "Electricidad y Magnetismo", "Análisis Numérico", "Análisis de Sistemas y Señales", "Costos y Evaluación de Proyectos", 
            "Estadística", "Acústica y Óptica", "Dinámica de Sistemas Físicos", "Análisis de Circuitos Eléctricos", "Energía e Impacto Ambiental", 
            "Introducción a la Economía", "Teoría Electromagnética", "Fundamentos de Control", "Dispositivos y Circuitos Electrónicos", "Maquinas Eléctricas I",
            "Medición e Intrumentación", "Diseño Digital", "Sistemas de Comunicación Electrónicas", "Amplificadores Electrónicos", "Sistemas Eléctricos de Potencia I",
            "Automatización", "Microprocesadores y Microcontroladores", "Procesamiento Digital de Señales", "Instalaciones Eléctricas", "Circuitos Integrados Analógicos",
            "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Subestaciones Eléctricas", "Electrónica de Potencia",
            "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Plantas Generadoras", "Recursos y Necesidades de México"};
        
        for (int i = 0; i <5; i++) {
            int a = (int) (Math.random() * (20 - 0)) + 0; //Valor para nombre      
            String materia = materias[a];       
            System.out.println(materia);
        }
    
    }
    
    //********** MÓDULO GENERADOR DE NOMBRES ************//
    
    public static void generarAlumnos(){
        //Declaración del array de nombres propios
        String[] nPropio= new String[]{"Sofía", "Margarita", "Dulce", "Ximena", "Andrea", "Raúl", "Diego", "Daniel", "Iker", "Fernando",
        "Luna", "Regina", "Renata", "Mariana", "Samantha", "Carlos", "Rodrigo", "Mateo", "Pablo", "José"};
        String[] ape = new String[]{"Hernández", "García", "Martínez", "López", "González", "Pérez", "Rodríguez", "Sánchez", "Ramírez",
        "Cruz", "Flores", "Gómez", "Díaz", "Torres", "Guerrero", "Mondragón", "Pineda", "Toledo", "Rivera", "Medina"};
        
        for (int i = 0; i < 20; i++) {
            int n = (int) (Math.random() * (20 - 0)) + 0; //Valor para nombre
            int m = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 1
            int o = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 2
        
        //Construcción del nombre
      
            String nombre = nPropio[n];
            String apellido = ape[m] + " " + ape[o];              
            System.out.println(nombre + " " + apellido);
        }
    }
    
     //********** MÓDULO GENERADOR DE PROMEDIOS ************//
    
    public static void generarProm(){
        float prom = (float) (Math.random() * (10 - 5)) + 5;   
        DecimalFormat frmt = new DecimalFormat();
	frmt.setMaximumFractionDigits(2);
	System.out.println("PROMEDIO: "+frmt.format(prom));      
    }
    
    //********** MÓDULO GENERADOR DE DIRECCIONES ************//
   
    public static void leerDirecciones(){
        
           try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            FileReader fr = new FileReader("direcciones.txt");
            br = new BufferedReader(fr);
            //System.out.println("El texto contenido en el archivo es: ");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   
    
    
}
