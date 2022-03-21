/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Михаил
 */
public class reverseString {
    public static void main (String [] args){
        String word = "wor";
        char [] reverse = word.toCharArray();
        for (int i = reverse.length-1; i>=0; i--){
            System.out.print(reverse[i]);
        }
    }
    
}
