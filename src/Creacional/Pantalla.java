/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacional;

/**
 *
 * @author 
 * Gladys Reyes 
 * Eva Elizondo
 * Arnol Morales 
 * Fabio Montes
 * 
 */
public class Pantalla extends Movil {
    private String resolucion;
    private int tamanno;

    public Pantalla(String resolucion, int tamanno, String marca, String color, double precio) {
        super(marca, color, precio);
        this.resolucion = resolucion;
        this.tamanno = tamanno;
    }

    /**
     * @return the resolucion
     */
    public String getResolucion() {
        return resolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * @return the tamanno
     */
    public int getTamanno() {
        return tamanno;
    }

    /**
     * @param tamanno the tamanno to set
     */
    public void setTamanno(int tamanno) {
        this.tamanno = tamanno;
    }
    
}
