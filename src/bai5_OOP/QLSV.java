/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
public class QLSV {

    public static ArrayList<SinhVien> listSV = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        nhapDanhSach();
        xuatDanhSach();
        timKiem();
        sua();
        xoa();
        sapXep();
         xuatDanhSach();
    }

    public static void nhapDanhSach() {
        System.out.println("Nhập Danh Sách SV");
        String yesNo;
        do {
            SinhVien sv = new SinhVien();
            sv.nhap();
            listSV.add(sv);// thêm đối tượng vào listSV

            System.out.println("Tiếp tục không? (Y/N)");
            yesNo = sc.nextLine();
        } while (yesNo.equalsIgnoreCase("Y"));
    }

    public static void xuatDanhSach() {
        System.out.println("Xuất Danh Sách SV");
        //fore+ ctrl+cách
        for (SinhVien sv : listSV) {
            sv.xuat();
//            System.out.println(sv.toString());
        }
    }

    public static void timKiem() {
        //tìm kiếm SInh VIên theo họ tên
        System.out.println("Nhập họ tên cần tìm: ");
        String hoTen = sc.nextLine();
        for (SinhVien sv : listSV) {
            if (sv.getHoTen().equalsIgnoreCase(hoTen)) {
                //equalsIgnoreCase: so sánh ko phân biệt chữ hoa thường
                sv.xuat();
//                break;// tìm thấy cái đầu tiên và thoát ra
            }
        }
    }

    public static void sua() {
        //Tìm kiếm SV theo mã SV
        //Sửa tuổi của SV
        System.out.println("Nhập mã sv cần sửa: ");
        String msv = sc.nextLine();
        for (SinhVien sv : listSV) {
            if (sv.getMsv().equalsIgnoreCase(msv)) {
                System.out.println("Nhập tuổi mới: ");
                int tuoi = sc.nextInt();
                sc.nextLine();
                sv.setTuoi(tuoi);// sửa tuổi = Setter
            }
        }
    }

    public static void xoa() {
        //Tìm kiếm SV theo mã SV
        //Xóa SV
        System.out.println("Nhập mã sv cần xóa: ");
        String msv = sc.nextLine();
        for (SinhVien sv : listSV) {
            if (sv.getMsv().equalsIgnoreCase(msv)) {
                listSV.remove(sv);
                break;
            }
        }
    }

    public static void sapXep() {
//        Collections.sort(listSV);
// => sắp xếp list có kiểu là Wrapper: Integer, Double,...
// => có thể so sánh được
        Comparator <SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
                //Wrapper: Integer, String, Double,...
//                return o1.getTuoi() > o2.getTuoi() ? 1: -1;
                //kiểu nguyên thủy: int, double, float
            }
        };
        /*
        =0: o1 = o2
        >0: o1 > o2
        <0: o1 <o2
        */
        Collections.sort(listSV, comp);
    }
}
