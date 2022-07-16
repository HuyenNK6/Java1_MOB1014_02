/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author HuyenNK
 */
public class DemoFor {
    public static void main(String[] args) {
        //for (khởi tạo; điều kiện; bước nhảy)
        for (int i=0; i< 10; i++){
            System.out.println("i= "+i);
            if(i==5){
                break; // kết thúc luôn vòng lặp
            }
        }
        System.out.println("Ví dụ 2");
        int tong=0;
        for (int i=0; i< 10; i++){            
            if(i%2==0){
                tong+=i;
                continue; // thực hiện vòng lặp tiếp luôn
            }
            System.out.println("i= "+i);
        }
        System.out.println("tổng= "+tong);
    }
}
