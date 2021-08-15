package proyecto_mpoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUD {
    private static final String SEPARATOR=",";
    private static String nombreRegistro = "Reinscripciones.csv";
    private static File archivoRegistro = new File(nombreRegistro);
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;

    public static void create(String numeroCuenta, String nombre, String edad, String direccion, String numeroReinscripcion ,String [] materias){  

        if(numeroCuenta.length()==9 && materias.length>=5)
            try {
                if(!archivoRegistro.exists()) 
                    archivoRegistro.createNewFile();

                br = new BufferedReader(new FileReader(nombreRegistro));
                bw = new BufferedWriter(new FileWriter(nombreRegistro,true));
                String line = br.readLine();
                String [] fields = {};
                Boolean noExisteRegistro = true;

                // Comprobar si existe la cuenta 
                while(noExisteRegistro && line!=null){
                    fields = line.split(SEPARATOR);
                    if(fields[0].equals(numeroCuenta)) 
                        noExisteRegistro = false;
                    line = br.readLine();
                }

                if(noExisteRegistro){
                    //  Escribe en el archivo
                    bw.write(numeroCuenta+","+nombre+","+edad+","+direccion+","+numeroReinscripcion);
                    for(int i=0;i<materias.length;i++){
                        bw.write(","+materias[i]);
                    }
                    bw.write("\n");
                    bw.flush();
                    System.out.println("Alumno agregado exitosamente");
                } else 
                    System.out.println("Ya se encuentra registrad@ en el sistema");
                    
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (br!=null && bw!=null) {
                    try {
                        br.close();
                        bw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } 
                }
            } // Fin del bloque try-catch-finally
        else { System.out.println("Los datos ingresados no son válidos, comprobar longitud"); }     
    }

    public static void read(String numeroCuenta){    

        if(numeroCuenta.length()==9) {
            if(archivoRegistro.exists()) {
                try {                    

                    br = new BufferedReader(new FileReader(nombreRegistro));
                    String line = br.readLine();
                    String [] fields = {};
                    Boolean noExisteRegistro = true;

                    // Comprobar si existe el registro
                    while(noExisteRegistro && line!=null){
                        fields = line.split(SEPARATOR);
                        if(fields[0].equals(numeroCuenta)) 
                            noExisteRegistro = false;
                        line = br.readLine();
                    }
                    if(!noExisteRegistro){
                        System.out.println("Se ha encontrado a: "+fields[1].trim()+"\nEdad: "+fields[2].trim()+"\nDirección: "+fields[3].trim()+"\nNum. Reinscripción: "+fields[4].trim()+"\nMaterias:");
                        for(int i=5;i<fields.length;i++){
                            System.out.println(i-4+".-"+fields[i]);
                        }
                    } else
                        System.out.println("No se ha encontrado a nadie");

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
                }  finally {
                    if (br!=null) {
                        try {
                            br.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        } 
                    }
                } // Fin del bloque try-catch-finally
            } else { System.out.println("No hay registros todavía"); }
        } else { System.out.println("Número de cuenta inválido"); }
    }

    public static void update(String numeroCuenta, String nombre, String edad, String direccion, Integer[] materiasACambiar, String [] materiasNuevas){
        
        if(numeroCuenta.length()==9 && (materiasACambiar.length == materiasNuevas.length)){
            if(archivoRegistro.exists()){
                File archivoRegistroTemp= new File("RegistrosTemp.csv");
                Boolean noExisteRegistro = true;              

                try {         
                    br = new BufferedReader(new FileReader(nombreRegistro));
                    bw = new BufferedWriter(new FileWriter(archivoRegistroTemp.getName(),true));
                    String line = br.readLine();
                    String [] fields = {};

                    // Lookup for the register that matches the nC 
                    while(line!=null){
                        fields = line.split(SEPARATOR);
                        if(fields[0].equals(numeroCuenta)){
                            noExisteRegistro = false; 
                            // Operador ternario
                            fields[1] = nombre.length()>0 ? nombre : fields[1];
                            fields[2] = edad.length()==2 ? edad : fields[2];
                            fields[3] = direccion.length()>0 ? direccion : fields[3];

                            if( materiasACambiar.length>0 && materiasNuevas.length>0 ){
                                for(int i=0;i<materiasACambiar.length;i++){
                                    fields[5 + (materiasACambiar[i]-1)] = materiasNuevas[i];
                                }
                            } else {
                                // Esto en caso
                                noExisteRegistro = true;
                                break;
                            }
                            
                        }
                        bw.write(String.join(",",fields)+"\n");
                        line = br.readLine();
                    }

                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    if (br!=null && bw!=null) {
                        try {
                            br.close();
                            bw.close();
                            if(noExisteRegistro){
                                // Elimina el archivo temporal
                                archivoRegistroTemp.delete();
                                System.out.println("No está registrada la cuenta");
                            } else {
                                // Elimina el archivo original
                                archivoRegistro.delete();
                                // Cambia el nombre de RegistrosTemp a Registros
                                archivoRegistroTemp.renameTo(new File(nombreRegistro));
                                System.out.println("Modificado con éxito");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        } 
                    }
                } // Fin del bloque try-catch-finally
            } else { System.out.println("No hay registros todavía"); }
        } else { System.out.println("Los datos ingresados no son válidos"); }
    }

    public static void delete(String numeroCuenta){      

        if(numeroCuenta.length()==9){
            if(archivoRegistro.exists()){
                File archivoRegistroTemp= new File("RegistrosTemp.csv");
                Boolean noExisteRegistro = true; 
                try {
                    br = new BufferedReader(new FileReader(nombreRegistro));
                    bw = new BufferedWriter(new FileWriter(archivoRegistroTemp.getName(),true));
                    String line = br.readLine();
                    String [] fields = {};                    

                    // Rellenar el archivo temporal RegistrosTemp con los datos de Registros pero sin incluir el alumno a eliminar
                    while(line!=null){
                        fields = line.split(SEPARATOR);
                        if(!fields[0].equals(numeroCuenta)){
                            bw.write(Arrays.toString(fields)+"\n");
                        } else noExisteRegistro = false;
                        line = br.readLine();
                    }
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(PROYECTO_MPOO.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    if (br!=null && bw!=null){ 
                        try {
                            br.close();
                            bw.close();
                            if(noExisteRegistro){
                                // Elimina el archivo temporal
                                archivoRegistroTemp.delete();
                                System.out.println("No está registrada la cuenta");
                            } else {
                                // Elimina el archivo original
                                archivoRegistro.delete();
                                // Cambia el nombre de RegistrosTemp a Registros
                                archivoRegistroTemp.renameTo(new File(nombreRegistro));
                                System.out.println("Eliminado con éxito");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } // Fin del bloque try-catch-finally
            } else { System.out.println("No hay registros todavía"); }
        } else { System.out.println("Los datos ingresados no son válidos"); }
    }

    public static void main(String[] args) {
        Boolean bandera = true;

        Scanner e;
        int num;
        while(bandera){
            e = new Scanner(System.in);
            System.out.println("Seleccione la opción deseada:");
            System.out.println("1: Crear alumno");
            System.out.println("2: Buscar alumno");
            System.out.println("3: Actualizar datos del alumno");
            System.out.println("4: Eliminar alumno");
            System.out.println("Cualquier otro número para salir\n");
            num = e.nextInt();
            switch (num) {
                case 1:
                    String[] materias = {"materia1","materia2","materia3","materia4","materias5"};

                    System.out.println("\n----- create(), crear alumno -----\n");
                    create("320054517", "Jose", "19", "Direccion", "106",materias);
                    System.out.println("\n----- ----- ----- ----- ----- -----\n");
                    break;
                case 2:
                    System.out.println("\n----- read(), buscar alumno -----\nPor favor ingresa la cuenta: ");
                    Scanner e1 = new Scanner(System.in);
                    String busqueda = e1.nextLine().trim();
                    
                    read(busqueda);
                    System.out.println("\n----- ----- ----- ----- ----- -----\n");
                    break;
                case 3:
                    Integer[] materiasACambiar = {1,3,4,5};
                    String[] materiasNuevas = {"Analisis de circuitos","Electricidad y Magnetismo","EIA","ASyS"};

                    System.out.println("\n----- update(), actualizar alumno -----\n");
                    update("420055817", "","","", materiasACambiar, materiasNuevas);
                    System.out.println("\n----- ----- ----- ----- ----- -----\n");
                    break;
                case 4:
                    System.out.println("\n----- delete(), eliminar alumno -----\n");
                    delete("420055817");
                    System.out.println("\n----- ----- ----- ----- ----- -----\n");
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