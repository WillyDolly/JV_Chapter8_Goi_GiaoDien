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

public class MyException{
    public static void main(String[] args) {
        int n[] = {4,8,15,32,64,127,256,512};
        int d[] = {2,0,4,4,0,8};
        for(int i=0;i<n.length;i++){
            try{
                if((n[i]%2)!=0)
                    throw new NonIntResultException(n[i],d[i]);// must go hand in hand with its catch
                System.out.println(n[i]+"/"+d[i]+"="+n[i]/d[i]);
            }
            catch(ArithmeticException ae){
                System.out.println("loi chia cho 0");
            }
            catch(ArrayIndexOutOfBoundsException aie){
                System.out.println("vuot mang");
            }
            catch(NonIntResultException exc){
                System.out.println(exc);// call toString to depict NonIntResultException
            }
        }
        }
}

class NonIntResultException extends Exception{
    int n;
    int d;
    NonIntResultException(int n, int d){
        this.n = n;
        this.d = d;
    }
   
    public String toString(){
        return  "Ket qua "  + n + "/"+ d + "khong phai so nguyen";
    }  
}    

