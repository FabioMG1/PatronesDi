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
public abstract  class Movil implements Cloneable {
    private  String marca;
     private  String color;
     private  double precio;

    public Movil(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }
public Object clone ()throws CloneNotSupportedException{
        
        return super.clone ();
    }
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
