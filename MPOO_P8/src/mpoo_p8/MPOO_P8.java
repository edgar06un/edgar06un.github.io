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
public class MPOO_P8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Poligono poligono; //Poligono que apunta a null
        //System.out.println(poligono);
        poligono = new Poligono(); //poligono -> obj creado por poligono()
        //Se crea a un objeto que apunta a un objeto creado
        System.out.println(poligono);
        
        //Objeto de tipo object
        //Todas las clases heredan de la clase object
        //Hago que un objeto apunte a poligono, es la misma direccion
        //HACE REFERENCIA A LO QUE HAGA REFERENCIA POLOGONO
        Object objeto = poligono;
        System.out.println(objeto);
        
        //Una referencia puede ser asignada a otros objetos
        
        //Apunta a otra direccion por que es distinto objeto
        poligono = new Triangulo();        
        System.out.println(poligono);
        
        //Sigue apuntando a la misma direccion
        System.out.println(objeto);
        //Variable que apunta a un objeto
        objeto = new Cuadrilatero();
        System.out.println(objeto);
        //Apunta a un cuadrilatero
        
        //poligono.setBase(6,5);
        poligono.area();
    
        poligono.area();
        
        queTipoEs(poligono);
        
        poligono = new Cuadrilatero();
        queTipoEs(poligono);
        
        System.out.println("#########INTERFAZ##########");
        //Se puede crear una referencia a la interfaz, pero no es posible instanciarla
        InstrumentoMusical inst;
        
        
        //A una referencia ala interfaz puede ser asiganda cualquier objeto que la implemente
        inst = new Flauta();
        //Esta flauta tiene el metodo tocar
        inst.tocar();
        System.out.println(inst.tipoInstrumento());
       
    }
    
    //Nuevo metodo 
    //El main es un metodo, por eso debe de estar fuera del main
    public static void queTipoEs(Poligono p){
        if(p instanceof Triangulo){
            //Convierto poligono en triangulo
            Triangulo t = (Triangulo) p;
            System.out.println("Triangulo con base "+t.getBase());            
        }else if (p instanceof Cuadrilatero){
            Cuadrilatero c = (Cuadrilatero) p;
            System.out.println("Cuadrilatero");
        }
    }
}
