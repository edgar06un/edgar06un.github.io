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
public class Alumno extends Persona {
    
    private int numCuenta;
    private boolean tieneBeca;

    public Alumno() {
    }

    public Alumno(int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.numCuenta = numCuenta;
        this.tieneBeca = tieneBeca;
    }

    
    
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public boolean isTieneBeca() {
        return tieneBeca;
    }

    public void setTieneBeca(boolean tieneBeca) {
        this.tieneBeca = tieneBeca;
    }
    
    
    
    public void estudiar(int numCuenta){
        System.out.println("Número de cuenta: "+numCuenta);
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "numCuenta=" + numCuenta + ", tieneBeca=" + tieneBeca + '}';
    }
    
    
    
}
