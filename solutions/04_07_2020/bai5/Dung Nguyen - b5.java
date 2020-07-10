/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweb4.b4;

import java.util.Scanner;

/**
 *
 * @author Dung Ng
 */
public class SUM {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" n >: ");
        int n = sc.nextInt();
        
        double a = 0;
        for (int i = 1; i <= n; i++) { 
            a += (1.0)/i;
        }
        System.out.println(" S = 1 + 1/2 + ... + 1/n = " + a);
        
        int b = 0;
        for (int i = 1; i <= n; i++) { 
            b += i;
        }
        System.out.println("S = 1 + 2 + ... + n = " +b);
        
        int c = 0;
        for (int i = 1; i <= n; i++) { 
            c += Math.pow(i,2);
        }
        System.out.println(" S = 1^2 + 2^2 + ... + n^2 = " +c);
        
        double d = 0;
        for (int i = 1; i <= n; i++) { 
            d += (1.0)/(2*i);
        }
        System.out.println(" S = 1/2 + 1/4 + ... + 1/2n = " +d);
        
        double e = 0;
        for (int i = 0; i <= n; i++) { 
            e += (1.0)/(2*i + 1);
        }
        System.out.println(" S = 1 + 1/3 + ... + 1/(2n+1) = " +e);
        
        double f = 0;
        for (int i = 1; i <= n; i++) { 
            f += (1.0)/(i * (i + 1));
        }
        System.out.println(" S = 1/(1*2) + 1/(2*3) + ... + 1/(n*(n+1)) =  " +f);
        
        double g = 0;
        for (int i = 0; i <= n; i++) { 
            g += (2*i + (1.0))/(2*i + 2);
        }
        System.out.println(" S = 1/2 + 3/4 + ... + (2*n + 1)/(2*n + 2) = " +g);
        
        int h = 1;
        int tam = 1;
        for (int i = 2; i <= n; i++) {
            tam = tam*i;
            h += tam;
        }
        System.out.printf(" S = 1 + 1*2 + ... + 1*2*...*n = " +h);
        
       
        
     
     }
}
