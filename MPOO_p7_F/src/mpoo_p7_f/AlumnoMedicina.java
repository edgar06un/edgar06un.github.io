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
public class AlumnoMedicina extends Alumno{
    
    private String instrumento;

    public AlumnoMedicina() {
    }

    public AlumnoMedicina(String instrumento, int numCuenta, boolean tieneBeca, String nombre, int edad, String genero) {
        super(numCuenta, tieneBeca, nombre, edad, genero);
        this.instrumento = instrumento;
    }

    
    
    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }
    
    
    
    public void curar(String instrumento){
        System.out.println("El alumno está practicando con un "+instrumento);
    }

    @Override
    public String toString() {
        return super.toString()+ "AlumnoMedicina{" + "instrumento=" + instrumento + '}';
    }
    
    
}
