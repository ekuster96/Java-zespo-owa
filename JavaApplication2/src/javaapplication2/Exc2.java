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
import javaapplication2.Exc;

public class Exc2 {
    public static void excMethod(String kek) throws Exc{
        throw new Exc(kek);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            excMethod("Method exception");
        } catch (Exc e){
            System.out.println(e.getChain());
        }
        
    }
}
