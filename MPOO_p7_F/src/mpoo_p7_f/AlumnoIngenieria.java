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
public class AlumnoIngenieria extends Alumno{
    private String circuito;

    public AlumnoIngenieria() {
    }

    public AlumnoIngenieria(String circuito, int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(numCuenta, tieneBeca, nombre, edad, genero);
        this.circuito = circuito;
    }
       

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }
    
    public void calcular(String circuito){
        System.out.println("El alumno esta construyendo un "+circuito);
    }

    @Override
    public String toString() {
        return super.toString()+ "AlumnoIngenieria{" + "circuito=" + circuito + '}';
    }
    
    
}
