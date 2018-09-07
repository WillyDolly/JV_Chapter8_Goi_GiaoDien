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
public class Try_Catch {
    public static void main(String[] args) {
        try{
            genException();
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("serious fault");
        }
    }
    public static void genException() {
        int[] a = {4,8,16,32,64,128,256,512};
        int[] b = {2,0,4,4,0,8};
       
        for(int i=0;i<a.length;i++){
            try{
                System.out.println(a[i]+"/"+b[i]+":"+a[i]/b[i]);
               // throw new ArithmeticException(); no need
            }
            catch(ArithmeticException exc){
                System.out.println("loi chia cho 0");
            }
             catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("vuot gioi han mang");
               throw exc;// ket qua giong nhu try/catch long ngoai vong for
                }
        }
        
       
    }
}
