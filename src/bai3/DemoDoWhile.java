/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoDoWhile {

    //psvm  
    public static void main(String[] args) {
        //While - kiểm tra điều kiện trước
        //Do-while- thực hiện ít nhất 1 lần sau đó mới kiểm tra điều kiện
        int i = 0;
        while (i < 5) {//nếu đk đúng => thực hiện công việc
            System.out.println("i= " + i);
            i++;
        }
        Scanner sc = new Scanner(System.in);
        //điểm từ 0-10
        int diem = 8;
        do {
            System.out.print("Nhập điểm= ");
            diem = sc.nextInt();
        } while (diem < 0 || diem > 10);
        System.out.println("điểm= " + diem);
        sc.nextLine();// loại bỏ ký tự xuống dòng
        //while(true)
        String ten;
        while(true){
            System.out.print("Nhập tên: ");
            ten= sc.nextLine();
            System.out.println("Xin chào "+ ten);
            if(ten.equalsIgnoreCase("Hang") ){
                break;
            }
            
        }
    }
}
