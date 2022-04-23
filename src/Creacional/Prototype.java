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
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        MovPrototype movpro = new MovPrototype();
        Movil movil = (Movil) movpro.prototipo("Pantalla");
        
        System.out.println("La marca es "+movil.getMarca());
    }
    
}
