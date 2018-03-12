package com.pruebaalmundo.callcenter;

/*
 * Clase para la asignacion de llamadas
 */

/**
 *
 * @author Pedro Alejandro Rojas Mesa
 */

public class Dispatcher extends Thread{

    /*
    * llamada: Id para identificacion de la llamada
    * telefno: Telefono desde donde se realiza la llamada
    * sgIni: Fecha (con segundos) en la cual se recibe la llamada
    * atendida: Variable para conocer si la llamada fue atendida
    * arregloEmp: Arreglo que contiene los empleados que pueden ser utilizados
    */
    
    private String llamada;
    private String telefono;
    private long sgIni;
    private boolean atendida;
    private Empleado[] arregloEmp;
    
    
    public Dispatcher(String llamada, String telefono, long sgIni){
        this.llamada = llamada;
        this.telefono = telefono;
        this.sgIni = sgIni;
        this.arregloEmp = VectorEmpleado.getarregloEmp();
    }
    
    @Override
    public void run(){       
        dispatchCall();
    }
        
    public void dispatchCall(){
        
        /*
        * Numero aleatorio que asignara el tiempo de la llamada
        * numero generado entre 5 y 10
        */
        int duracionLlamada = (int)Math.floor(Math.random()*(10-5+1)+5);
        
        //Se recorre el vector de empleados
        for (int i = 0; i < this.arregloEmp.length; i++) { 
            //Valida si se encuentra libre
            if (this.arregloEmp[i].getLibre()){
                //Configura el cliente ocupado
                this.arregloEmp[i].setLibre(false);
                System.out.println("Recibida llamada: "+this.llamada+" Telefono: "+this.telefono+" Llamada asignada a: "+this.arregloEmp[i].getNombre()+" Con perfil: "+this.arregloEmp[i].getPerfil()+" DuracionLlamada: "+duracionLlamada);
                //Espera del hilo la cantidad de segundos del numero aleatorio
                esperarXsegundos(duracionLlamada);
                //Libera el hilo
                getArregloEmp()[i].setLibre(true);
                System.out.println(this.arregloEmp[i].getNombre()+" esta libre de la llamada>>"+this.llamada+"<< invirtiendo>>"+ (System.currentTimeMillis() - this.sgIni) / 1000 +" sg");
                this.atendida = true;
                stop();
            }
	}
        if (!this.atendida)
            System.out.println("No hay operadores disponbles para atender llamada: "+this.llamada);
        
    }
    
    /*
    * Metodo que pone a esperar el hilo la cantidad de tiempo indicada
    * @param segundos: cantidad de segundos que se debe dormir el hilo
    */
    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
        }
    }

    /**
     * @return the llamada
     */
    public String getLlamada() {
        return llamada;
    }

    /**
     * @param llamada the llamada to set
     */
    public void setLlamada(String llamada) {
        this.llamada = llamada;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the sgIni
     */
    public long getSgIni() {
        return sgIni;
    }

    /**
     * @param sgIni the sgIni to set
     */
    public void setSgIni(long sgIni) {
        this.sgIni = sgIni;
    }

    /**
     * @return the arregloEmp
     */
    public Empleado[] getArregloEmp() {
        return arregloEmp;
    }

    /**
     * @param arregloEmp the arregloEmp to set
     */
    public void setArregloEmp(Empleado[] arregloEmp) {
        this.arregloEmp = arregloEmp;
    }
}
