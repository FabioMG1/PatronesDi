/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacional;

import java.util.HashMap;

/**
 *
 * @author 
 * Gladys Reyes 
 * Eva Elizondo
 * Arnol Morales 
 * Fabio Montes
 * 
 */
public class MovPrototype {
    private HashMap<String, Movil> prototipos = new HashMap<String, Movil>();
    
    public MovPrototype (){
        
        Pantalla pant = new Pantalla("HD", 6, "Huawei", "Azul", 350700);
        LCD lcd =new LCD(459000, "Samsung", "negro", 460000);
         prototipos.put("Pantalla", pant);
   prototipos.put("LCD", lcd);
    }
     public Object prototipo (String tipo) throws CloneNotSupportedException{
        return prototipos.get(tipo).clone();
    }
}
