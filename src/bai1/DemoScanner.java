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
public class DemoScanner {
    public static void main(String[] args) {
        //<kiểu dữ liệu> <tên biến> [= giá trị];
        int a;
        a= 9;
        int b=5;
        int c= a+b; //+ - * /
        System.out.print("Hello");
        System.out.println("Class");
        System.out.println("c= "+ c);
        System.out.printf("c= %d", c);
        System.out.println("Bye");
        
        Scanner scanner= new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen= scanner.nextLine();// cho phép nhập 1 dòng từ bàn phím
        System.out.println("Xin chào "+hoTen);
        
        System.out.print("Tuổi: ");
        int tuoi= scanner.nextInt(); // cho phép nhập 1 số nguyên từ bàn phím
        System.out.println(hoTen + " tuổi "+ tuoi);
        
        System.out.print("Cân nặng: ");
        double canNang= scanner.nextDouble();
        System.out.println(hoTen+ " nặng "+ canNang +"(kg)");
        // \n
        scanner.nextLine();
        System.out.println("Quê quán: ");
        String queQuan= scanner.next();
        System.out.println(""+queQuan);
    }
}
