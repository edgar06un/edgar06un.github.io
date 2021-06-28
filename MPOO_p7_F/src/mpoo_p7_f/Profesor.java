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
public class Profesor extends Persona{
    
    private int numEmpleado;
    private float sueldo;

    public Profesor() {
    }

    public Profesor(int numEmpleado, float sueldo, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    
    
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public void calificar(float sueldo){
        System.out.println("El suledo es: "+sueldo);
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
}
