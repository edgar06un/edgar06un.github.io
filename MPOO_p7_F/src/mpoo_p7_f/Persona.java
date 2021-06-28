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
public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    public Persona() {
    }

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
    public void hablar(String nombre){
        System.out.println("Nombre: "+nombre);        
    }

    @Override
    public String toString() {
        return super.toString()+"Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + '}';
    }
    
    
}
