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
public class ThrowableMethod {
    static void genException(){
        int nums[] = new int[4];
        System.out.println("before exception generated");
        // create index out of bounds
        nums[5] = 10;
        System.out.println("this line not shown");
    }
}
class UseThrowableMethods{
    public static void main(String[] args) {
        try{
            ThrowableMethod.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("standard fault: ");
            System.out.println(exc);
            System.out.println("\n StackTrace: ");
               exc.printStackTrace();
        }
        System.out.println("after try/catch");
    }
}
