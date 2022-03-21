/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Михаил
 */
public class MaxMin {
    public static void main (String[] args ){
        int[] array ={2,3,9,-9,22};
        int max = array[0];
        for (int i =1; i<array.length; i++){
                       if (array[i]>max){
                             max = array[i];    
            }
        }
        System.out.print (max);
    }
    
}
