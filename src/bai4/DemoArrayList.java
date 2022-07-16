/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HuyenNK
 */
public class DemoArrayList {

    /*
    ArrayList được sử dụng như một mảng động
    để lưu trữ các phần tử
    - ArrayList được tạo với một kích cỡ ban đầu
    - Khi kích cỡ bị vượt => collection tự dộng được tăng
    - Khi đối tượng bị xóa=> kích cỡ ArrayList bị giảm
     */
    public static void main(String[] args) {
        //ArrayList Có định kiểu- Không định kiểu
        //1. Khởi tạo
        //ArrayList Không định kiểu
        //=> Chứa các phần tử bất kể là loại dữ liệu gì
        /*
        - Phải ép kiểu của các phần tử
         */
        ArrayList arrListKDK = new ArrayList();
        //2. Gán giá trị: sử dụng phương thức add()
        arrListKDK.add("FPT");//String
        arrListKDK.add(1);//int
        arrListKDK.add(true);//boolean

        //ArrayList Có định kiểu 
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
        System.out.println("số lượng phần tử size= " + arrListKDK.size());
        for (int i = 0; i < arrListKDK.size(); i++) {
            System.out.println(arrListKDK.get(i));
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
