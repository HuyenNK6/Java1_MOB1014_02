/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_OOP;

import java.util.Scanner;

/**
 *
 * @author HuyenNK
 */
    /*
    - Tạo 1 class (lớp) đối tượng sinh viên
    - Tên đối tượng phải viết hoa chữ cái đầu
*/
public class SinhVien {
    //1. Liệt kê các thuộc tính mà đối tượng cần có
    private String msv; //private các thuộc tính
    private String hoTen;//khi private sẽ chỉ dc sử dụng trong class
    private String sđt;
    private String email;
    private int tuoi;
    // 2. Constructor: hàm tạo
    /*
    - Tên Constructor giống tên class => public
    - Nếu khi khởi tạo đối tượng mà ko có constructor 
    => chương trình sẽ tự động tạo cho đối tượng 1 constructor ko tham số
    */
    //Ctrl cách+ enter
    //Chuột phải-> Insert Code (Alt+Insert) => constructor
    //2.1 Constructor không tham số:
    // để khởi tạo đối tượng không có giá trị ban đầu
    public SinhVien() {
    }
    //2.1 Constructor có tham số
    // để khởi tạo đối tượng có giá trị luôn
    public SinhVien(String msv, String hoTen, String sđt, String email, int tuoi) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.sđt = sđt;
        this.email = email;
        this.tuoi = tuoi;
    }

    public SinhVien(String msv, String hoTen) {
        this.msv = msv;
        this.hoTen = hoTen;
    }
    //3. Getter và Setter
    // Vì thuộc tính bị private => sd Getter & Setter để lấy ra và gán giá trị cho nó

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSđt() {
        return sđt;
    }

    public void setSđt(String sđt) {
        this.sđt = sđt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    //Insert Code => toString()

    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", hoTen=" + hoTen + ", email=" + email + ", tuoi=" + tuoi + '}';
    }
    public void nhap (){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập thông tin");
        System.out.print("MSV: ");
        this.msv= sc.nextLine();
        System.out.print("Họ tên: ");
        this.hoTen= sc.nextLine();
        System.out.print("Tuổi: ");
        this.tuoi= sc.nextInt();
        sc.nextLine();
        System.out.print("Email: ");
        this.email= sc.nextLine();
        
    }
    public void xuat(){
        System.out.println("THÔNG TIN");
        System.out.println("MSV= "+ msv);
        System.out.println("Họ tên= "+ hoTen);
        System.out.println("Email= "+email);
        System.out.println("Tuoi= "+ tuoi);
    }


}
