/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.*;

/**
 *
 * @author Usuario
 */
public class MainParty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> l = new ArrayList<String>();
        
        l.add("Hola");
        l.add("Hola1");
        l.add("Hola2");
        l.add("Hola3");
        System.out.println(l.size());
        
       Iterator it =l.iterator();
       
       while(it.hasNext()){
           System.out.println(it.next());
       }
        
    }
    
}
