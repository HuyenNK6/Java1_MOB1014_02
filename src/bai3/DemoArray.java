/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class DemoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Mảng Array
        String maSinhVien[] = new String[5];
        System.out.println("Độ dài mảng: " + maSinhVien.length);
        for (int i = 0; i < maSinhVien.length; i++) {
            System.out.printf("Nhập mã sinh viên [%d]= ", i);
            maSinhVien[i] = sc.nextLine();
        }
        for (int i = 0; i < maSinhVien.length; i++) {
            System.out.println("Cách 1: Sinh viên " + maSinhVien[i]);
        }
        //for each
        for (String msv : maSinhVien) {
            System.out.println("Cách 2: Sinh Viên " + msv);
        }      
        //toString
        System.out.println("Cách 3: Sinh Viên " + Arrays.toString(maSinhVien));       
        //sắp xếp tăng dần
        Arrays.sort(maSinhVien);
        System.out.println("Mảng sau sắp xếp: " + Arrays.toString(maSinhVien));
        //tìm kiếm
        int viTri = Arrays.binarySearch(maSinhVien, "77");
        System.out.println("Vị trí sinh viên 77= " +viTri);

    }
}
