/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author 1
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A exObj = new B();
        B exObj1 = new B();
        
        System.out.println(exObj.first());
        System.out.println(exObj.second() + "\n");
        
        System.out.println(exObj1.first());
        System.out.println(exObj1.third());
        System.out.println(exObj1.second());
        
        
        int i = 128;int y = 128;
        Integer o = i;
        Integer t = y;
        
        System.out.println(o == t);
        System.out.println(o.equals(t));
    }
    
}
