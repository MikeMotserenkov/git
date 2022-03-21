/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Михаил
 */

public class PointsOfReflection {
    public static void main (String[] args ){
        int[] p ={0,0};
        int[] q ={0,0};
        int[] reflectPoint = new int[2];
        int vayX=Math.abs(q[0]-p[0]);
        int vayY=Math.abs(q[1]-p[1]);
        System.out.print("Vay x=");
        System.out.println(vayX);
        System.out.print("Vay y=");
        System.out.println(vayY);
        
        if (q[0]<=p[0] && q[1]<=p[1]){
	reflectPoint[0] = q[0] - vayX;
        reflectPoint[1] = q[1] - vayY;
	System.out.print("x=");
        System.out.println(reflectPoint[0]);
        System.out.print("y=");
        System.out.println(reflectPoint[1]);
        System.exit(0);
		}
        if (q[0]>=p[0]&& q[1]>=p[1]){
	reflectPoint[0] = q[0] + vayX;
        reflectPoint[1] = q[1] + vayY;
        System.out.print("x=");
	System.out.println(reflectPoint[0]);
        System.out.print("y=");
        System.out.println(reflectPoint[1]);
	System.exit(0);
        }
        if (q[0]>=p[0]&& q[1]<=p[1]){
	reflectPoint[0] = q[0] + vayX;
        reflectPoint[1] = q[1] - vayY;
        System.out.print("x=");
	System.out.println(reflectPoint[0]);
        System.out.print("y=");
        System.out.println(reflectPoint[1]);
	System.exit(0);
        }
        if (q[0]<=p[0]&& q[1]>=p[1]){
	reflectPoint[0] = q[0] - vayX;
        reflectPoint[1] = q[1] + vayY;
        System.out.print("x=");
	System.out.println(reflectPoint[0]);
        System.out.print("y=");
        System.out.println(reflectPoint[1]);
	System.exit(0);
        }
	
    }
    
}
