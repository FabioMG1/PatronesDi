/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

/**
 *
 * @author 
 * Gladys Reyes 
 * Eva Elizondo
 * Arnol Morales 
 * Fabio Montes
 * 
 */
public class ProxyE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RealSubject subject = new RealSubject();
        Proxy p = new Proxy(subject);
        p.request();
    }
    
}
  interface Subject {
    void request();
}

class RealSubject implements Subject {
    @Override
    public void request(){
        System.out.println("Sujeto Real");
    }
}

class Proxy implements Subject {
    private final Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }
    @Override
    public void request(){
        System.out.println("Empezar");
        subject.request();
        System.out.println("Fin");
    }
}
