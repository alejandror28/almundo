/*
 * Clase para probar la distribucion de llamadas
 */
package com.pruebaalmundo.callcenter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro Alejandro Rojas Mesa
 */

public class DispatcherTest {
    
    public DispatcherTest() {
        System.out.println("Creacion de vector de empleados");
        Empleado[] arregloEmp = VectorEmpleado.getarregloEmp();
        //Creacion de los operarios
        for (int i = 0; i < 7; i++) {
            arregloEmp[i] = new Empleado(true, "Operario", "Operario "+(i+1));
        }
        //Creacion de los supervisores
        for (int i = 7; i < 9; i++) {
            arregloEmp[i] = new Empleado(true, "Supervisor", "Supervisor "+(i-6));
        }
        //Creacion del director
        arregloEmp[9] = new Empleado(true, "Director", "Director 1");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class Dispatcher.
     */
    @Test
    public void testRun() {
        
        long initialTime = System.currentTimeMillis();
        System.out.println("Creacion de las llamadas");
        Dispatcher llamada1 = new Dispatcher("1", "123", initialTime);
        Dispatcher llamada2 = new Dispatcher("2", "456", initialTime);
        Dispatcher llamada3 = new Dispatcher("3", "789", initialTime);
        Dispatcher llamada4 = new Dispatcher("4", "012", initialTime);
        Dispatcher llamada5 = new Dispatcher("5", "345", initialTime);
        Dispatcher llamada6 = new Dispatcher("6", "678", initialTime);
        Dispatcher llamada7 = new Dispatcher("7", "901", initialTime);
        Dispatcher llamada8 = new Dispatcher("8", "234", initialTime);
        Dispatcher llamada9 = new Dispatcher("9", "567", initialTime);
        Dispatcher llamada10 = new Dispatcher("10", "890", initialTime);
        System.out.println("Lanzamiento de las llamadas");
        llamada1.start();
        llamada2.start();
        llamada3.start();
        llamada4.start();
        llamada5.start();
        llamada6.start();
        llamada7.start();
        llamada8.start();
        llamada9.start();
        llamada10.start();
    }

    
}
