/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebaalmundo.callcenter;

import com.pruebaalmundo.callcenter.Empleado;

/**
 *
 * @author User
 */
public class VectorEmpleado {
    
    private static Empleado[] arregloEmp;
    
    public static Empleado[] getarregloEmp(){
        if (arregloEmp != null){
            arregloEmp = new Empleado[10];
        }
        return arregloEmp;
    }
    
}
