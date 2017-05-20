
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

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("1245678M","Perico de los Palotes");
        empleado1.imprimir_emp();
        System.out.println("El salario del empleado es "+empleado1.calcula_sueldo(1200));
        
        
        /*
        *Esta parte del código se ha comentado pues ya no es funcional al ser 
        *privados los atributos.
        *
        empleado1.direccion="C/del Pez,6";
        empleado1.numHijos=3;
        System.out.println("DNI: "+empleado1.dni);
        System.out.println("Nombre: "+empleado1.nombre);
        System.out.println("Cargo: "+empleado1.cargo);
        System.out.println("Número de hijos: "+empleado1.numHijos);
        System.out.println("Sueldo: "+empleado1.calcula_sueldo(1200));
        */
        
    }
    
}
