/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mpoo;

/**
 *
 * @author edgarriv69
 */
public class Alumno {
    
    String[] nombre;
    String[] apellido;
    int edad;
    String[] direccion;
    int numIns;
    
    
    String[] asignaturas= new String[]{"Álgebra", "Cálculo y Geometría Analítica", "Química", "Redacción y Exposición de Temas de Ingeniería", "Fundamentos de Programación", 
            "Álgebra Lineal", "Cálculo Integral", "Mecánica", "Cultura y Comunicación", "Estructura de Datos y Algoritmos I", 
            "Termodinámica", "Cálculo Vectorial", "Ecuaciones Diferenciales", "Optativa de Competencias Profesionales", "Modelos de Progrmación Orientada a Objetos", 
            "Probabilidad", "Electricidad y Magnetismo", "Análisis Numérico", "Análisis de Sistemas y Señales", "Costos y Evaluación de Proyectos", 
            "Estadística", "Acústica y Óptica", "Dinámica de Sistemas Físicos", "Análisis de Circuitos Eléctricos", "Energía e Impacto Ambiental", 
            "Introducción a la Economía", "Teoría Electromagnética", "Fundamentos de Control", "Dispositivos y Circuitos Electrónicos", "Maquinas Eléctricas I",
            "Medición e Intrumentación", "Diseño Digital", "Sistemas de Comunicación Electrónicas", "Amplificadores Electrónicos", "Sistemas Eléctricos de Potencia I",
            "Automatización", "Microprocesadores y Microcontroladores", "Procesamiento Digital de Señales", "Instalaciones Eléctricas", "Circuitos Integrados Analógicos",
            "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Subestaciones Eléctricas", "Electrónica de Potencia",
            "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Asignatura del Campo de Profundización", "Plantas Generadoras", "Recursos y Necesidades de México"};
    
    //Variables para asignar el número de inscripción:
    public float promedio;
    public float asigIns;
    public float asigAprob;
    
    public float creditoAlum;
    public float creditoIngreso;
    

    public Alumno() {
    }

    public Alumno(String[] nombre, String[] apellido, int edad, String[] direccion, String[] asignaturas, int numIns) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.asignaturas = asignaturas;
        this.numIns = numIns;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getApellido() {
        return apellido;
    }

    public void setApellido(String[] apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getDireccion() {
        return direccion;
    }

    public void setDireccion(String[] direccion) {
        this.direccion = direccion;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getNumIns() {
        return numIns;
    }

    public void setNumIns(int numIns) {
        this.numIns = numIns;
    }

    
    public float numInscripcion(){
        return promedio*((asigAprob/asigIns)*100)*((creditoAlum/creditoIngreso)*100);
    }
    
    //********** MÓDULO GENERADOR DE NOMBRES ************//
    
    public void generarAl(){
                //Declaración del array de nombres propios
        String[] nPropio= new String[]{"Sofía", "Margarita", "Dulce", "Ximena", "Andrea", "Raúl", "Diego", "Daniel", "Iker", "Fernando",
        "Luna", "Regina", "Renata", "Mariana", "Samantha", "Carlos", "Rodrigo", "Mateo", "Pablo", "José"};
        String[] ape = new String[]{"Hernández", "García", "Martínez", "López", "González", "Pérez", "Rodríguez", "Sánchez", "Ramírez",
        "Cruz", "Flores", "Gómez", "Díaz", "Torres", "Guerrero", "Mondragón", "Pineda", "Toledo", "Rivera", "Medina"};
        int n = (int) (Math.random() * (20 - 0)) + 0; //Valor para nombre
        int m = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 1
        int o = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 2
        
        //Construcción del nombre
        String nombre = nPropio[n];
        String apellido = ape[m] + " " + ape[o];
        
        System.out.println("Nombre: " + nombre + " " + "Apellidos: " + apellido);
    }
    
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion + ", asignaturas=" + asignaturas + ", numIns=" + numIns + '}';
    }
    
    
    
}
