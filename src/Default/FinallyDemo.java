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
public class FinallyDemo {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            UseFinally.genException(i);
        }
    }
}

 class UseFinally{
    public static void genException(int what){
        int t;
        int nums[] = new int[2];
        try{
            switch(what){
                case 0:
                    t = 10/what; break;
                case 1:
                    nums[4] = 4; break;
                case 2:
                    return;      
            }
        }
            catch(ArithmeticException exc){
                    System.out.println("divide 0 fault");
                    return;
                    }
            catch(ArrayIndexOutOfBoundsException exc){
                    System.out.println(" can't find the corresponding member");
                    }
        finally{// best use for closing file, network connection
            System.out.println("escape from try/catch");
        }
    }
}
