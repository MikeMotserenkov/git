
import java.util.Arrays;
import java.lang.Iterable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Михаил
 */
public class SquareDigit {
    public static void main (String [] args){
        int n = 2568;
        String str = Integer.toString(n);
         int [] res2 = new int[str.length()] ;
         double res=0;
         int res1 =0;
             for (int i =0; i<str.length(); i++){
       res = n/Math.pow(10,str.length()-i-1);  
       res1 = (int) res;
       res = Math.pow(res1,2);
       n = (int) (n-(res1 * Math.pow(10,str.length()-i-1)));
       res2 [i] =(int) Math.pow(res1,2);
    }
int nbr = 0;
double multiplier = 1;
for(int i = res2.length-1; i >=0 ;i--) {
    nbr += res2[i] * multiplier;
    multiplier = Math.pow(10, String.valueOf(nbr).length());
}
System.out.println(nbr);
}  
    }