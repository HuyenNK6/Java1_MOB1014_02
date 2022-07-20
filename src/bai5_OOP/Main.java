/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_OOP;

import java.util.ArrayList;

/**
 *
 * @author HuyenNK
 */
public class Main {
    public static void main(String[] args) {
        //1. Khởi tạo đối tượng 
        SinhVien sv1 = new SinhVien("PH18106", "Nguyen Khanh Huyen",
                                                    "0985621874", "huyen@gmail.com", 20);
        SinhVien sv2= new SinhVien();
        //gán giá trị cho từng thuộc tính
        sv2.setMsv("PH12345");
        sv2.setHoTen("Nguyễn Văn Anh");
        sv2.setSđt("0875416952");
        sv2.setEmail("anh@gmail.com");
        sv2.setTuoi(18);
        //Lấy ra thông tin
        System.out.println("Xin chào sv1 "+ sv1.getHoTen());
        System.out.println(sv1);
        System.out.println(sv2.toString());
        
        SinhVien sv3= new SinhVien();
        sv3.nhap();
        sv3.xuat();
        //ArrayList: mảng động chứa các đối tượng là sinh viên
        ArrayList <SinhVien> list= new ArrayList<>();
        list.add(sv1);//thêm các phần tử vào trong list
        list.add(sv2);
        list.add(sv3);
        
        System.out.println("Danh sách Sinh Viên");
        //fore+ ctrl+ cách 
        for (SinhVien sv : list) {
//            sv.xuat();
            System.out.println(sv.toString());
        }
    }
}
