/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginarybeing;

/**
 *
 * @author alancerio18
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hero h = new SuperMan();
        
        System.out.println(h.name()+ " " + h.origin());    
    }
}
