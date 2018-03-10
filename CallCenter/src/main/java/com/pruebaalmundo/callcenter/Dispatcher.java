package com.pruebaalmundo.callcenter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import com.pruebaalmundo.callcenter.VectorEmpleado;

/**
 *
 * @author User
 */
public class Dispatcher extends Thread{

    private String llamada;
    private String telefono;
    private int tiempoLlamada;
    private long sgIni;
    private Empleado[] arregloEmp;
    
    public Dispatcher(String llamada, String telefono, int tiempoLlamada, long sgIni){
        this.llamada = llamada;
        this.telefono = telefono;
        this.tiempoLlamada = tiempoLlamada;
        this.sgIni = sgIni;
        this.arregloEmp = VectorEmpleado.getarregloEmp();
    }
    
    @Override
    public void run(){
        
        //Se recorre el vector para saber quien se encuentra libre
        for (int i = 0; i < this.arregloEmp.length; i++) { 
            if (this.arregloEmp[i].getLibre()){
                this.arregloEmp[i].setLibre(false);
                System.out.println("Recibida llamada>>"+this.llamada+"<< Telefono>>"+this.telefono+"<<");
                System.out.println("Llamada asignada a>>"+this.arregloEmp[i].getNombre()+"<< Con perfil>>"+this.arregloEmp[i].getPerfil()+"<<");
                esperarXsegundos(tiempoLlamada);
                getArregloEmp()[i].setLibre(true);
                System.out.println(this.arregloEmp[i].getNombre()+" esta libre de la llamada>>"+this.llamada+"<< invirtiendo>>"+ (System.currentTimeMillis() - this.sgIni) / 1000 +" sg");
                stop();
            }
             
	}
        
    }
    
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

    /**
     * @return the tiempoLlamada
     */
    public int getTiempoLlamada() {
        return tiempoLlamada;
    }

    /**
     * @param tiempoLlamada the tiempoLlamada to set
     */
    public void setTiempoLlamada(int tiempoLlamada) {
        this.tiempoLlamada = tiempoLlamada;
    }

    
}
