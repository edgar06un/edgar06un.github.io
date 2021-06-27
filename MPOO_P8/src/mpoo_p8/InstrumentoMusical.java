/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoo_p8;

/**
 *
 * @author edgarriv69
 */

//Se puede crear una clase comun y agregar el interface
public interface InstrumentoMusical {
    //Todo es de tipo public
    //Todos los instrumentos tienen:
    void tocar();
    
    void afinar();
    
    String tipoInstrumento();
    
}
