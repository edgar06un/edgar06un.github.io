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
public class Flauta extends InstrumentoViento{
    //Puede sobreescribir algun metodo y agregar funcionalidades
    public void tocarHimno(){
        System.out.println("Tocando himno");
    }
    
    //Agegar funcionalidad y sobreescribir algun metodo con override 
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
}
