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
public class giai_thua {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int x = 1;
//        if(n == 0 || n == 1){
//            System.out.println("kq: "+x);
//        }
//        else{
            for (int i = 1; i <= n; i++) {
                x = x*i;
            }
            System.out.println("kq: "+x);
//        }
        
    }
}
