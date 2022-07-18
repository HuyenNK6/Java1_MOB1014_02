/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HuyenNK
 */
public class DemoList {
    /*
    List là 1 interface trong Java
    List interface trong Java kế thừa Collection=> cung cấp các phương thức
    để thao tác vs các phần trong danh sách
    */
    public static void main(String[] args) {
        //List Có định kiểu- Không định kiểu
        //1. Khởi tạo
        //List Không định kiểu
        //=> Chứa các phần tử bất kể là loại dữ liệu gì
        /*
        - Phải ép kiểu của các phần tử
         */
        List listKDK = new ArrayList(); //bôi đen+ ctrl+ R => sửa tên
        //2. Gán giá trị: sử dụng phương thức add()
        listKDK.add("FPT");//String
        listKDK.add(1);//int
        listKDK.add(true);//boolean

        //List Có định kiểu 
        //=> chỉ chứa các phần tử có kiểu đã chỉ định
        /*
        - các phần tử không cần ép kiểu
        - chặt chẽ => code  & xử lý nhanh
         */
        //Lớp bao Wrapper: Integer, Double, Float 
        // >< không sử dụng kiểu nguyên thủy: int, double
        ArrayList<Integer> arrListCDKInt = new ArrayList<Integer>();
        arrListCDKInt.add(6);
        arrListCDKInt.add(2);
        arrListCDKInt.add(9);

        //3. Truy xuất dữ liệu
        // Phương thức get(index)
        System.out.println("số lượng phần tử size= " + listKDK.size());
        for (int i = 0; i < listKDK.size(); i++) {
            System.out.println(listKDK.get(i));
            //lấy ra phần tử tại vị trí thứ i trong mảng không định kiểu
        }
        //for- each => hay dùng
        //Mảng Có định kiểu int
        //fore +ctrl+ cách
        System.out.println("Mảng có định kiểu");
        for (Integer numInt : arrListCDKInt) {
            System.out.println(numInt);
        }
        //4. Sắp xếp
        Collections.sort(arrListCDKInt); // sắp xếp tăng dần
        Collections.reverse(arrListCDKInt);// đảo ngược lại
        System.out.println("ArrayList sau sắp xếp");
        for (Integer numInt : arrListCDKInt) {
            System.out.println(numInt);
        }
        
        //5. Phương thức khác
         System.out.println(arrListCDKInt.isEmpty());
        // kiểm tra ArrayList có trống ko
         if (arrListCDKInt.isEmpty()){
             System.out.println("Danh sách trống");
         }

    }
}
