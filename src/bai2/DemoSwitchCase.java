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
public class DemoSwitchCase {

    //psvm+TAB
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("-------MENU----------");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Kết thúc");
        System.out.println("---------------------");
        System.out.println("Chọn chức năng (1-3)? ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        System.out.println("Chức năng " + answer);
//        if (answer==1){
//            phepCong();
//        }else if( answer == 2 ){
//            phepTru();
//        }else{
//            System.exit(0);
//        }
//CTRL+ /
        switch (answer) {
            case 1:
                phepCong();
            case 2:
                phepTru();
                break;
            default:
                System.exit(0);
        }
    }

    public static void phepCong() {
        System.out.println("phép cộng");
    }

    public static void phepTru() {
        System.out.println("phép trừ");
    }
}
