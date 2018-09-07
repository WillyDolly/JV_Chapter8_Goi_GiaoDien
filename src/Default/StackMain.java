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
public class StackMain {
    public static void main(String[] args) {
        StackDemo s = new StackDemo(4);
        System.out.println("push");
        try{
        for(int i=0;i<5;i++){
            s.push((char)('a'+i));
              System.out.println(""+((char)('a'+i)));
        }
        }catch(ExceptionForStack.StackFullException exc){
            System.out.println(exc);
        }
        
        System.out.println("pop");
        try{
        for(int j=0;j<5;j++)
            System.out.println( s.pop());
        }catch(ExceptionForStack.StackEmptyException exc){
            System.out.println(exc);
        }
    }
}
