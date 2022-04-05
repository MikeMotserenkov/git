/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Михаил
 */
public class ArrayIntoPart {
    public static void main (String []args){
        int lArray = 683;
int countArray = 9;
int lArray1 = lArray/countArray;
int nArray = lArray%countArray;
int nArrayLength = ((int) lArray/countArray)+1;
int kArray = countArray-nArray;
int kArrayLength = (int) lArray/countArray;
if (lArray%countArray==0){
    System.out.println(" Длинна массивов равна "+lArray1); 
}
else if (lArray%countArray!=0){
 System.out.println(nArray+" Длинна массивов равна "+nArrayLength+" и "+kArray+" Длинна массивов равна "+kArrayLength);   
}
       
    }
    
}
