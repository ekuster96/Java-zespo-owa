/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Student
 */
public class Exc extends Exception {
    
    private String chain;

    public Exc(String chain) {
        this.chain = chain;
    }

    public String getChain() {
        return chain;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //Exc ex = new Exc("Mój wyjątek");
            throw new Exc("Mój wyjątek");
            //System.out.println(ex.getChain());
        } catch (Exc e){
            System.out.println(e.getChain());
        }
        
        try {
            Exc a = null;
            a.getChain(); 
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
   
    
    
}
