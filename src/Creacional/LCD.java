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
public class LCD extends Movil{
    private double precFab;

    public LCD(double precFab, String marca, String color, double precio) {
        super(marca, color, precio);
        this.precFab = precFab;
    }

    /**
     * @return the precFab
     */
    public double getPrecFab() {
        return precFab;
    }

    /**
     * @param precFab the precFab to set
     */
    public void setPrecFab(double precFab) {
        this.precFab = precFab;
    }
}
