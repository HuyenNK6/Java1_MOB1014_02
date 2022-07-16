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
public class Test {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Menu();
        }

    }

    public static void Menu() {

        System.out.println("+---------MENU---------+");
        System.out.println("  1. Thuế thu nhập");
        System.out.println("  2. Số ngày của tháng");
        System.out.println("  3. Kết thúc");
        System.out.println("+----------------------+");
        System.out.println("Chon chuc nang : ");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1:
                Menu1();
                break;
            case 2:
                Menu2();
                break;
            case 3:
                System.exit(0);

            default:
                System.out.println("chon chuc nang tu 1 - 3");

        }

    }

    public static void Menu1() {
        double thue;

        System.out.println("Moi nhap luong : ");
        double luong = Double.parseDouble(sc.nextLine());
        System.out.println("Moi nhap thuong : ");
        double thuong = Double.parseDouble(sc.nextLine());

        double tong = luong + thuong;
        System.out.println("Tong Luong voi Thuong la : " + tong);

        if (tong < 12000000) {
            thue = tong * 0.05;
            System.out.println("Thue la : " + thue);
        } else if (tong >= 12000000 || tong <= 20000000) {
            thue = tong * 0.1;
            System.out.println("Thue la : " + thue);
        } else if (tong >= 2000000 || tong <= 30000000) {
            thue = tong * 0.15;
            System.out.println("Thue la : " + thue);
        } else {
            thue = tong * 0.2;
            System.out.println("Thue la : " + thue);
        }

    }

    public static void Menu2() {
        int thang;
        int nam;
        int ngay;

        System.out.println("Moi nhap nam :");
        nam = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap thang : ");
        thang = Integer.parseInt(sc.nextLine());

        if (nam % 4 == 0) {
            switch (thang) {
                case 1:
                    System.out.println("31 ngay");
                    break;
                case 2:
                    System.out.println(" Nam Nhuan: 29 ngay");
                    break;
                case 3:
                    System.out.println("31 ngay");
                    break;
                case 4:
                    System.out.println("30 ngay");
                    break;
                case 5:
                    System.out.println("31 ngay");
                    break;
                case 6:
                    System.out.println("30 ngay");
                    break;
                case 7:
                    System.out.println("31 ngay");
                    break;
                case 8:
                    System.out.println("31 ngay");
                    break;
                case 9:
                    System.out.println("30 ngay");
                    break;
                case 10:
                    System.out.println("31 ngay");
                    break;
                case 11:
                    System.out.println("30 ngay");
                    break;
                case 12:
                    System.out.println("31 ngay");
                    break;
                default:
                    System.out.println("chon tu 1 - 12");
            };
        } else {
            switch (thang) {
                case 2:
                    System.out.println("Khong phai nam Nhuan : 28 ngay");
                    break;
            }
        }

    }

}
