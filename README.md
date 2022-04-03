[33mcommit 8ea1b58b50f5513fa4c5cb704699d2332d72da77[m[33m ([m[1;36mHEAD -> [m[1;32mmain[m[33m, [m[1;31morigin/main[m[33m, [m[1;31morigin/HEAD[m[33m)[m
Author: Mike <mikle98@mail.ru>
Date:   Mon Mar 21 20:10:06 2022 +0300

    add MaxMin.java, PointsOfReflection.java, reverseString.java

[1mdiff --git a/MaxMin.java b/MaxMin.java[m
[1mnew file mode 100644[m
[1mindex 0000000..c4dfe3f[m
[1m--- /dev/null[m
[1m+++ b/MaxMin.java[m
[36m@@ -0,0 +1,23 @@[m
[32m+[m[32m/*[m
[32m+[m[32m * To change this license header, choose License Headers in Project Properties.[m
[32m+[m[32m * To change this template file, choose Tools | Templates[m
[32m+[m[32m * and open the template in the editor.[m
[32m+[m[32m */[m
[32m+[m
[32m+[m[32m/**[m
[32m+[m[32m *[m
[32m+[m[32m * @author Михаил[m
[32m+[m[32m */[m
[32m+[m[32mpublic class MaxMin {[m
[32m+[m[32m    public static void main (String[] args ){[m
[32m+[m[32m        int[] array ={2,3,9,-9,22};[m
[32m+[m[32m        int max = array[0];[m
[32m+[m[32m        for (int i =1; i<array.length; i++){[m
[32m+[m[32m                       if (array[i]>max){[m
[32m+[m[32m                             max = array[i];[m[41m    [m
[32m+[m[32m            }[m
[32m+[m[32m        }[m
[32m+[m[32m        System.out.print (max);[m
[32m+[m[32m    }[m
[32m+[m[41m    [m
[32m+[m[32m}[m
[1mdiff --git a/PointsOfReflection.java b/PointsOfReflection.java[m
[1mnew file mode 100644[m
[1mindex 0000000..12900e0[m
[1m--- /dev/null[m
[1m+++ b/PointsOfReflection.java[m
[36m@@ -0,0 +1,63 @@[m
[32m+[m[32m/*[m
[32m+[m[32m * To change this license header, choose License Headers in Project Properties.[m
[32m+[m[32m * To change this template file, choose Tools | Templates[m
[32m+[m[32m * and open the template in the editor.[m
[32m+[m[32m */[m
[32m+[m
[32m+[m[32m/**[m
[32m+[m[32m *[m
[32m+[m[32m * @author Михаил[m
[32m+[m[32m */[m
[32m+[m
[32m+[m[32mpublic class PointsOfReflection {[m
[32m+[m[32m    public static void main (String[] args ){[m
[32m+[m[32m        int[] p ={0,0};[m
[32m+[m[32m        int[] q ={0,0};[m
[32m+[m[32m        int[] reflectPoint = new int[2];[m
[32m+[m[32m        int vayX=Math.abs(q[0]-p[0]);[m
[32m+[m[32m        int vayY=Math.abs(q[1]-p[1]);[m
[32m+[m[32m        System.out.print("Vay x=");[m
[32m+[m[32m        System.out.println(vayX);[m
[32m+[m[32m        System.out.print("Vay y=");[m
[32m+[m[32m        System.out.println(vayY);[m
[32m+[m[41m        [m
[32m+[m[32m        if (q[0]<=p[0] && q[1]<=p[1]){[m
[32m+[m	[32mreflectPoint[0] = q[0] - vayX;[m
[32m+[m[32m        reflectPoint[1] = q[1] - vayY;[m
[32m+[m	[32mSystem.out.print("x=");[m
[32m+[m[32m        System.out.println(reflectPoint[0]);[m
[32m+[m[32m        System.out.print("y=");[m
[32m+[m[32m        System.out.println(reflectPoint[1]);[m
[32m+[m[32m        System.exit(0);[m
[32m+[m		[32m}[m
[32m+[m[32m        if (q[0]>=p[0]&& q[1]>=p[1]){[m
[32m+[m	[32mreflectPoint[0] = q[0] + vayX;[m
[32m+[m[32m        reflectPoint[1] = q[1] + vayY;[m
[32m+[m[32m        System.out.print("x=");[m
[32m+[m	[32mSystem.out.println(reflectPoint[0]);[m
[32m+[m[32m        System.out.print("y=");[m
[32m+[m[32m        System.out.println(reflectPoint[1]);[m
[32m+[m	[32mSystem.exit(0);[m
[32m+[m[32m        }[m
[32m+[m[32m        if (q[0]>=p[0]&& q[1]<=p[1]){[m
[32m+[m	[32mreflectPoint[0] = q[0] + vayX;[m
[32m+[m[32m        reflectPoint[1] = q[1] - vayY;[m
[32m+[m[32m        System.out.print("x=");[m
[32m+[m	[32mSystem.out.println(reflectPoint[0]);[m
[32m+[m[32m        System.out.print("y=");[m
[32m+[m[32m        System.out.println(reflectPoint[1]);[m
[32m+[m	[32mSystem.exit(0);[m
[32m+[m[32m        }[m
[32m+[m[32m        if (q[0]<=p[0]&& q[1]>=p[1]){[m
[32m+[m	[32mreflectPoint[0] = q[0] - vayX;[m
[32m+[m[32m        reflectPoint[1] = q[1] + vayY;[m
[32m+[m[32m        System.out.print("x=");[m
[32m+[m	[32mSystem.out.println(reflectPoint[0]);[m
[32m+[m[32m        System.out.print("y=");[m
[32m+[m[32m        System.out.println(reflectPoint[1]);[m
[32m+[m	[32mSystem.exit(0);[m
[32m+[m[32m        }[m
[32m+[m[41m	[m
[32m+[m[32m    }[m
[32m+[m[41m    [m
[32m+[m[32m}[m
[1mdiff --git a/README.md b/README.md[m
[1mdeleted file mode 100644[m
[1mindex 8d36a8e..0000000[m
[1m--- a/README.md[m
[1m+++ /dev/null[m
[36m@@ -1 +0,0 @@[m
[31m-# git[m
[1mdiff --git a/reverseString.java b/reverseString.java[m
[1mnew file mode 100644[m
[1mindex 0000000..ebdd0c0[m
[1m--- /dev/null[m
[1m+++ b/reverseString.java[m
[36m@@ -0,0 +1,20 @@[m
[32m+[m[32m/*[m
[32m+[m[32m * To change this license header, choose License Headers in Project Properties.[m
[32m+[m[32m * To change this template file, choose Tools | Templates[m
[32m+[m[32m * and open the template in the editor.[m
[32m+[m[32m */[m
[32m+[m
[32m+[m[32m/**[m
[32m+[m[32m *[m
[32m+[m[32m * @author Михаил[m
[32m+[m[32m */[m
[32m+[m[32mpublic class reverseString {[m
[32m+[m[32m    public static void main (String [] args){[m
[32m+[m[32m        String word = "wor";[m
[32m+[m[32m        char [] reverse = word.toCharArray();[m
[32m+[m[32m        for (int i = reverse.length-1; i>=0; i--){[m
[32m+[m[32m            System.out.print(reverse[i]);[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
[32m+[m[41m    [m
[32m+[m[32m}[m
