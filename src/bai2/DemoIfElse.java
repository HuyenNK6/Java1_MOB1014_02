/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoIfElse {

    //psvm +TAB
    public static void main(String[] args) {
        /*
        If (điều kiện){
            <câu lênh>
        } else {
            <câu lệnh>
        }
         */
        int a = 10;
        int b = 25;
        int min = a > b ? b : a;
        System.out.println("min= " + min);

        //Nhập số dương từ bàn phím & tình căn bậc 2
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số dương: ");
            int number = sc.nextInt();

            if (number > 0) {
                System.out.println("Đây là số dương");
                double ketQua = Math.sqrt(number); //kết quả: tính căn bậc 2
                System.out.println("Căn bậc 2 của số " + number + " là " + ketQua);
                System.out.printf("Căn bậc 2 của số %d là %.3f", number, ketQua);
                System.out.println();
            } else {
                System.out.println("Không phải số dương");
            }
        } catch (Exception ex) {
            System.out.println("Bạn phải nhập vào số!");
        }
    }
}
