/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;

/**
 *
 * @author hai
 */
public class ThrowsDemo {
    public static char prompt(String str)throws java.io.IOException{
        System.out.println("str: "+str);
        return (char) System.in.read();
    }
    
    public static void main(String arg[]){
        char ch;
        try{
            ch = prompt("Enter a character:");
        }
        catch(java.io.IOException exc){
            System.out.println("had an exception");
            ch = 'X';
        }
        System.out.println("you've just entered "+ch);
    }
}
