/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 * 
 * @author Carlos Talavera
 * @version 1.0 20 de Mayo de 2017
 */



public class Empleado {
    /**
    * Variable privada: DNI del empleado
    */
    private  String dni; 
    /**
    * Variable privada: nombre del empleado
    */
    private String nombre;
    /**
    * Variable privada: dirección del empleado
    */
    private String direccion;
    /**
    * Variable privada: cargo del empleado
    */
    private String cargo;
    /**
    * Variable privada: número de hijos del empleado
    */
    private int numHijos;
    
    
    /**
    * Constructor de la clase Empleado    
    * @param dni String 
    * @param nombre String
    */
      public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    /**
    * Método setter del atributo dni de la clase empleado
     * @param d String 
    */
    public void setDni(String d){
        this.dni=d;
    }
    
    /**
    * Método getter del atributo dni de la clase empleado
     * @return String el DNI
    */
    public String getDni(){
        return (this.dni);
    }
    
    /**
    * Método setter del atributo nombre de la clase empleado
     * @param nom String
    */
    public void setNombre(String nom){
        this.nombre=nom;
    }
    
    /**
    * Método getter del atributo nombre de la clase empleado
     * @return String el nombre
    */
    public String getNombre(){
        return (this.nombre);
    }
    
    /**
    * Método setter del atributo dirección de la clase empleado
     * @param direcc String
    */
    public void setDireccion(String direcc){
        this.direccion=direcc;
    }
    
    /**
    * Método getter del atributo dirección de la clase empleado
     * @return String la dirección
    */
    public String getDitreccion(){
        return (this.direccion);
    }
   
    /**
    * Método setter del atributo cargo de la clase empleado
     * @param carg String 
    */
    
    public void setCargo(String carg){
        this.cargo=carg;
    }
    
    /**
    * Método getter del atributo cargo de la clase empleado
     * @return String el cargo
    */
    public String getCargo(){
        return (this.cargo);
    }
    
    /**
    * Método setter del atributo numHijos de la clase empleado
     * @param hijos int
    */
    public void setNumHijos(int hijos){
        this.numHijos=hijos;
    }
    
    /**
    * Método getter del atributo numHijos de la clase empleado
    * @return int el número de hijos
    */
    public int getNumHijos(){
        return (this.numHijos);
    }
    
    /**
    * Método para clacular el sueldo del empleado en base a su cargo y número de hijos
    * @param base double el sueldo base
    * @return total double el sueldo total que gana el empleado
    */
    
    public double calcula_sueldo(double base) {
        double total = base;

        if (cargo.equals("ENCARGADO")) {
            total += 300;
        } else if (cargo.equals("DIRECTOR")) {
            total += 1000;
        }
        if (numHijos >= 3) {
            total += numHijos * 50;
        }
        return total;
    }
    
    /**
    * Método para imprimir por pantalla los atributos del empleado 
    * @param direcc String 
    * @param nhijos String
    * 
    */
    public void imprimir_emp(String direcc, int nhijos){
        this.direccion=direcc;
        this.numHijos=nhijos;
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Número de hijos: "+this.numHijos);
        System.out.println("Sueldo: "+this.calcula_sueldo(1200));
        
    }
    // Sobrecarga del metodo imprimir_emp para comprobar la actualización en GitHub
    
    /**
    * Método para imprimir por pantalla los atributos del empleado sin recibir parámetros
    * 
    */
    public void imprimir_emp(){
        
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Número de hijos: "+this.numHijos);
        System.out.println("Sueldo: "+this.calcula_sueldo(1200));
        
    }
}
