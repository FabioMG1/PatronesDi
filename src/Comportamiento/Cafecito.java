/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Comportamiento;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author
 * Gladys Reyes 
 * Eva Elizondo
 * Arnol Morales 
 * Fabio Montes
 */
public class Cafecito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Types> type = new ArrayList <>();
        type.add(new Types ("1", "cafe late"));
        type.add(new Types ("2", "cafe americano"));
        type.add(new Types ("1", "cafe mokka"));
        type.add(new Types ("1", "cafe capuchino"));
        
        System.out.println(type);
    }
    private static String printCafe(ArrayList<Types> type){
     
        String list="";
        Iterator <Types> i= type.iterator();
        
        while (i.hasNext()){
        
        list+= i.next().toString();
        }
        return list;
    }
    
    public static class Types {
        
        private String code;
        private String name;

        public Types() {
        }

        public Types(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

         public String toString() {
            return  "Codigo del cafe =  " + code + " Nombre del cafe =" + name + '}'+"\n";
         }
    }
}


    
       
        
        

  
    


