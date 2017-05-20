/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Empleado {
    private  String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;
    
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    //Creamos el método setter para el atributo Dni
    public void setDni(String d){
        this.dni=d;
    }
    
    //Creamos el método getter para el atributo Dni
    public String getDni(){
        return (this.dni);
    }
    
    //Creamos el método setter para el atributo Nombre
    public void setNombre(String nom){
        this.nombre=nom;
    }
    
    //Creamos el método getter para el atributo Nombre
    public String getNombre(){
        return (this.nombre);
    }
    
    //Creamos el método setter para el atributo Dirección
    public void setDireccion(String direcc){
        this.direccion=direcc;
    }
    
    //Creamos el método getter para el atributo Dirección
    public String getDitreccion(){
        return (this.direccion);
    }
   
    //Creamos el método setter para el atributo Cargo
    public void setCargo(String carg){
        this.cargo=carg;
    }
    
    //Creamos el método getter para el atributo Cargo
    public String getCargo(){
        return (this.cargo);
    }
    
    //Creamos el método setter para el atributo NumHijos
    public void setNunHijos(int hijos){
        this.numHijos=hijos;
    }
    
    //Creamos el método getter para el atributo NumHijos
    public int getNumHijos(){
        return (this.numHijos);
    }
    
    
    
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
    
    public void imprimir_emp(String direcc, int nhijos){
        this.direccion=direcc;
        this.numHijos=nhijos;
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cargo: "+this.cargo);
        System.out.println("Número de hijos: "+this.numHijos);
        System.out.println("Sueldo: "+this.calcula_sueldo(1200));
        
    }
}
