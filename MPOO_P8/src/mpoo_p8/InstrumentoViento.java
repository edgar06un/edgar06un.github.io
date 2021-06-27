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

//Clase instrumento de viento que implementa una clase intrumento musical 
//Se necesitan implementar metodos abstractos. Sobreescribir de insturmento muscial

public class InstrumentoViento extends Object implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }

    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
        
    }
    
}
