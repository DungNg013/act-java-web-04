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
public class nguyen_to {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("n > : ");
        int n = input.nextInt();
        
        int m = 0;
        
        for(int i = 2; i < n*1000; i++)
        {
            boolean kt = true;
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    kt = false;
                    break;
                }
            }
            if(kt){
                System.out.printf(" %d ", i);
                m ++;
            }
            if (m == n){
                System.out.println("  ");
                return;
            }
        }
    }
}
