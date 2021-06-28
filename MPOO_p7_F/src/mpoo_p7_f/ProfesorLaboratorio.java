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
public class ProfesorLaboratorio extends Profesor{
    
    private String numLaboratorio;

    public ProfesorLaboratorio() {
    }

    public ProfesorLaboratorio(String numLaboratorio, int numEmpleado, float sueldo, String nombre, int edad, String genero) {
        super(numEmpleado, sueldo, nombre, edad, genero);
        this.numLaboratorio = numLaboratorio;
    }
    
    
    public String getNumLaboratorio() {
        return numLaboratorio;
    }

    public void setNumLaboratorio(String numLaboratorio) {
        this.numLaboratorio = numLaboratorio;
    }
    
    
    public void usoBata(String numLaboratorio){
        System.out.println("Laboratorio asignado: "+numLaboratorio);
    }

    @Override
    public String toString() {
        return "ProfesorLaboratorio{" + "numLaboratorio=" + numLaboratorio + '}';
    }
    
    
}
