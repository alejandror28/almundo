/*
 * Clase que contiene el vector de empleados a consutar por los hilos
 */

package com.pruebaalmundo.callcenter;


/**
 *
 * @author User
 */
public class VectorEmpleado {
    
    private static Empleado[] arregloEmp;
    
    /*
    * Metodo que retorna el vector de empleados
    * Si el vector se encuentra vacio, lo define de 10 elementos
    */
    public static Empleado[] getarregloEmp(){
        if (arregloEmp == null){
            arregloEmp = new Empleado[10];
        }
        return arregloEmp;
    }
    
}
