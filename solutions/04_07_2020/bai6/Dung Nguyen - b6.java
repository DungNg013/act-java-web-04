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
public class UCLN_BCNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" a >: ");
        int a = sc.nextInt();
        System.out.print(" b >: ");
        int b = sc.nextInt();      
        System.out.println("UCLN");
        int tem1 = a;
        int tem2 = b;
        while(tem1 != tem2){
            if (tem1 > tem2){
                tem1 -= tem2;
            } else {
                tem2 -= tem1;
            }
        }
        int ucln = tem1;
        System.out.println("ucln >: " +ucln );
        
        System.out.println("BCNN");
        int bcnn = (a*b)/ucln;
        System.out.println("bcnn >:"+bcnn );
    }
}
