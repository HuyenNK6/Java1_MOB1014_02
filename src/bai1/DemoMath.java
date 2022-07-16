/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoMath {
    public static void main(String[] args) {
//        //tính delta= b^2- 4ac
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Nhập a= ");
//        double a= sc.nextDouble();
//        System.out.print("Nhập b= ");
//        double b= sc.nextDouble();
//        System.out.print("Nhập c= ");
//        double c= sc.nextDouble();
//        
//        double delta= Math.pow(b, 2) - 4*a*c;
//        System.out.println("delta= "+ delta);   
//        //random số từ 5-12
//        double number= 5+7*Math.random();
//        System.out.println("number = "+ number);
//        System.out.printf("number = %.1f", number);
//        System.out.println();
        
        char x= '2';
        int y= x;
        System.out.println(y);
        // byte- short- int- long- float- double: widening
        int i= 100;
        long l= i;
        double d= l;
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        
        double d1= 234.012;
        long l1= (long) d1;
        int i1= (int) l1;
        System.out.println(d1);
        System.out.println(l1);
        System.out.println(i1);
        
        char ch = 'A';
        char ch2 = '9';
        int num = ch;
        int num2 = Integer.parseInt(String.valueOf(ch2));
        System.out.println("ASCII của kí tự "+ch+ " là: "+num);
        System.out.println("ASCII của kí tự "+ch2+ " là: "+num2);
        System.out.println("----------------------------");
        
  
    }
}
