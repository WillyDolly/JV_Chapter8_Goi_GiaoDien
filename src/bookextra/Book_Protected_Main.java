/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookextra;

import bookpack.Book;

/**
 *
 * @author hai
 */
public class Book_Protected_Main {
    public static void main(String[] args) {
        BookExtra[] ext = new BookExtra[3];
        ext[0] = new BookExtra("peter","flying",7.5,"NXB");
        ext[1] = new BookExtra("harry","do it",9,"GB");
        ext[2] = new BookExtra("carry","laugh",8.79,"JKL");
        for(int i=0;i<ext.length;i++){
            if(ext[i].getAuthor().equals("harry"))
                ext[i].show();
        }
        //ext.title = "can not access";
    }
}
