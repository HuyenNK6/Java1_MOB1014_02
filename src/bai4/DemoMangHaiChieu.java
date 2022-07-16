/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoMangHaiChieu {

    /*
    Mảng Hai chiều
    <kiểu dữ liệu> [][] <tên mảng> = new <kiểu dữ liệu> [row][col];
    - row: số hàng
    - col: số cột
     */
    public static void main(String[] args) {
        //1. Khởi tạo
        //mảng hai chiều gồm row= 2 hàng và col= 3 cột
        int[][] arr = new int[2][3];
        //2. Gán giá trị
        //gán giá trị hàng 1
        arr[0][0] = 5;
        arr[0][1] = 9;
        arr[0][2] = 1;
        //gán giá trị hàng 2
        arr[1][0] = 8;
        arr[1][1] = 3;
        arr[1][2] = 4;
        //3. truy xuất dữ liệu
        System.out.println("arr[0][1]= " + arr[0][1]);
        for (int i = 0; i < 2; i++) {//for+ ctrl+ cách
            //2: số hàng- i: vị trí của hàng
            for (int j = 0; j < 3; j++) { //for+ ctrl+ cách
                //3: số cột- j: vị trí của cột
                System.out.printf("hàng %d | cột %d = ", i, j);
                System.out.println(arr[i][j]);// phần tử tại hàng i cột j
            }
        }
        //in ma trận
        for (int i = 0; i < 2; i++) {//for+ ctrl+ cách
            //2: số hàng- i: vị trí của hàng
            for (int j = 0; j < 3; j++) { //for+ ctrl+ cách
                //3: số cột- j: vị trí của cột 
                // \t: tab
                System.out.print(arr[i][j] + "\t");// phần tử tại hàng i cột j
            }
            System.out.println("");
        }
        //ĐB: Cho ng dùng tạo mảng 2 chiều
        // với số hàng và số cột đc nhập từ bàn phím
        // ng dùng tự nhập gán giá trị 
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.print("Nhập số hàng row= ");
        row = sc.nextInt();
        System.out.print("Nhập số cột col= ");
        col = sc.nextInt();
        //mảng 2 chiều có row hàng và col cột
        int[][] arrNumber = new int[row][col];
        // gán giá trị
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập [%d][%d]= ", i, j);
                arrNumber[i][j] = sc.nextInt();
            }
        }
        //truy xuất dữ liệu
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Giá trị [%d][%d]= %d"
                        , i, j, arrNumber[i][j]);
                System.out.println("");
            }
        }
    }
}
