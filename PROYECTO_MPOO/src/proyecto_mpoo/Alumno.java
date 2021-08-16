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
import static java.lang.Integer.min;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edgarriv69
 */
public class Alumno {
    
    //Variables para asignar el número de inscripción:
    
    public float promedio, numInscrip;
    public int numCuenta, edad;
    public String nombreCompleto, direccion;
    public String[] materias;
   

    public Alumno() {
    }

    public Alumno(float promedio, float numInscrip, int numCuenta, int edad, String nombreCompleto, String direccion, String[] materias) {
        this.promedio = promedio;
        this.numInscrip = numInscrip;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.materias = materias;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public float getNumInscrip() {
        return numInscrip;
    }

    public void setNumInscrip(float numInscrip) {
        this.numInscrip = numInscrip;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Alumno{" + "promedio=" + promedio + ", numInscrip=" + numInscrip + ", numCuenta=" + numCuenta + ", edad=" + edad + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", materias=" + materias + '}';
    }

    

 

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
    
    //********** MÓDULO GENERADOR DE NÚMEROS DE CUENTA************//
    
    public int generarnumCuenta(Alumno a){
        a.numCuenta = (int) (Math.random() * (313304940 - 420304941)) + 420304941;   
	//System.out.println(a.numCuenta);
        return a.numCuenta;
    }
    
    
    
    //********** MÓDULO GENERADOR DE NOMBRES ************//
   
    public String nombres(Alumno a){
        
        String[] nPropio= new String[]{"Sofía", "Margarita", "Dulce", "Ximena", "Andrea", "Raúl", "Diego", "Daniel", "Iker", "Fernando",
        "Luna", "Regina", "Renata", "Mariana", "Samantha", "Carlos", "Rodrigo", "Mateo", "Pablo", "José"};
        String[] ape = new String[]{"Hernández", "García", "Martínez", "López", "González", "Pérez", "Rodríguez", "Sánchez", "Ramírez",
        "Cruz", "Flores", "Gómez", "Díaz", "Torres", "Guerrero", "Mondragón", "Pineda", "Toledo", "Rivera", "Medina"};
        
            int n = (int) (Math.random() * (20 - 0)) + 0; //Valor para nombre
            int m = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 1
            int o = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 2
        
            String nombre = nPropio[n];
            String apellido = ape[m] + " " + ape[o];              
           
            a.nombreCompleto = nombre + " " + apellido;
        
        
        return a.nombreCompleto;
    }
    
    
     //********** MÓDULO GENERADOR DE DATOS PERSONALES ************//
   
    public String edad(Alumno a){
        
  
            int aleatorio_edad = 0;
            int numLineas = 1;
            int contador = 0;
            
        //Construcción de un nombre con edad
            aleatorio_edad = (int)(Math.random()*(27-18+1)+18);
            a.edad = aleatorio_edad;
            
            String sedad= Integer.toString(edad);
        return sedad;

    }
   
    
    //**** MÓDULO GENERADOR NUMERO DE INCRIPCIÓN ****//
   public String generarincrip(Alumno a)  { 
        float prom = (float) (Math.random() * (10 - 5)) + 5;   
        float aprobadas = (int) (Math.random()*5+1);
        float incritas = (int) (Math.random()*53);
        float credialu = (int) (Math.random()* 446);
        int creditotal = 446;
        DecimalFormat frmt = new DecimalFormat();
	frmt.setMaximumFractionDigits(2);
        DecimalFormat frmtt = new DecimalFormat();
	frmtt.setMaximumFractionDigits(0);
        float Escolaridad =aprobadas/incritas*100;
        float velocidad = ((credialu/ creditotal)*100);
        float Num_Insripcion = prom * Escolaridad * velocidad;
        System.out.println("PROMEDIO: "+frmt.format(prom));
        System.out.println( "El numero de inscripción es:"+ frmtt.format(Num_Insripcion)); 
      
        a.promedio = prom;
        a.numInscrip = Num_Insripcion;
              
        int b;

        b = (int)a.numInscrip;
        
        String sProm = Float.toString(promedio);
        String sNumIns = Integer.toString(b);

        return sNumIns;
        
   }
    
   
    
    //********** MÓDULO GENERADOR DE DIRECCIONES ************//
   
    public String direccion (Alumno a){
               
            int numLineas = (int)(Math.random() * (50 - 1)) + 1;
            int contador = 1;
            
          
        //DIRECCIONES
        try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            FileReader fr = new FileReader("direcciones.txt");
            br = new BufferedReader(fr);
            //System.out.println("El texto contenido en el archivo es: ");
            String linea = br.readLine();
            while(linea != null && contador<=numLineas){
                // System.out.println("Dirección: "+linea);
                if(contador==numLineas)
                    a.direccion = linea;
                else
                    linea = br.readLine();
                contador ++;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return a.direccion;
    }
    
    
    //********** MÓDULO GENERADOR DE MATERIAS ************//
    
    public String[] generarMaterias(Alumno a){
    
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

        int i1 = (int)(Math.random()*50+0);
        int i2 = (int)(Math.random()*50+0);
        int i3 = (int)(Math.random()*50+0);
        int i4 = (int)(Math.random()*50+0);
        int i5 = (int)(Math.random()*50+0);
        String[] materia = {materias[i1],materias[i2],materias[i3],materias[i4],materias[i5]};
        
          
          
        return materia;
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
    
    
    
    
    //********** MÓDULO LECTOR DE REGISTROS ************//
   
    public static void leerRegistro(){
        
           try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            FileReader fr = new FileReader("Reinscripciones.csv");
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
    
    //AUXILIAR
    public static int getRandom() {
        int numero = (int)(Math.random()*40+0);
        return numero;
    }
   
   
    
}
