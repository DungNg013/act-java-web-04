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
public class JavaWeb4B4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("*");
//                
//            }
//            System.out.println("");
            
//        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float x1,x2;
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("ft vo so nghiem");
                }
                else{
                    System.out.println("ft vo nghiem");
                }      
            }
            else{               
                System.out.println("kq: " +(-c/b));
            }
        }
        else{
           float delta = b*b - 4*a*c;
           if(delta < 0){
               System.out.println("ft vo nghiem");
           }
           else if(delta == 0){
               System.out.println("ft co nghiem kep: "+(-b/(2*a)));
           }
           else{
               x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
                x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
               System.out.println("x1 = "+x1);
               System.out.println("x2 = "+x2);
           } 
        }
                
    }
    
}
