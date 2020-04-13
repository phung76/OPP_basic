/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

import java.util.Scanner;

/**
 *
 * @author NGOC PHUNG
 */
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều rộng:");
        double rong = sc.nextDouble();
        System.out.println("nhập chiều dài:");
        double dai= sc.nextDouble();
 
        System.out.println("chu vi hình chữ nhật"+(rong+dai)/2);
        System.out.println("dien tich hình chữ nhật"+(rong*dai));
        System.out.println(Math.min(rong, dai));
    }
    
}
