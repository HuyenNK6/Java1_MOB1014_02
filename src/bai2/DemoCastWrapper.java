/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author HuyenNK
 */
public class DemoCastWrapper {

    //psvm+TAB
    public static void main(String[] args) {
        int i = 100;
        long l = i;
        double d = l;
        //sout+TAB
        System.out.println("i= " + i);
        System.out.println("l= " + l);
        System.out.println("d= " + d);
        double d2= 123.456;
        long l2= (long) d2;
        int i2= (int) l2;
        System.out.println("d2= " + d2);
        System.out.println("l2= " + l2);
        System.out.println("i2= " + i2);
  
        Integer number= new Integer(100); //Bao - Boxing
        System.out.println("number= "+ number);
        int value= number.intValue(); //Mở bao - Unboxing
        System.out.println("value= "+value);
    }
}
