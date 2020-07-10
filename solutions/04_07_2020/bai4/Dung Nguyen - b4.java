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
public class stop_at_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int [] n = new int [100000];
        do {            
            n[i] = sc.nextInt();
        }while( n[i] != 0);
         int max = n[0], min = n[0];
        for(int p = 1; p <= i; p++){
            if (  max < n[p]){
                max = n[p];
            }
        }
        System.out.println("max >: " + max);             
        for(int q = 1; q <= i; q++){
            if (min > n[q]){
                min = n[q];
            }
        }
        System.out.println("min >: " + min);    
    }
 }

