/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto_mpoo;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.*;
/**
 *
 * @author edgarriv69
 */

public class PROYECTO_MPOO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
    
    //********** MÓDULO GENERADOR DE DATOS PERSONALES ************//
    try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            FileReader fr = new FileReader("direcciones.txt");
            br = new BufferedReader(fr);
            //System.out.println("El texto contenido en el archivo es: ");
            String linea = br.readLine();
            while(linea != null){
                //System.out.println(linea);
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