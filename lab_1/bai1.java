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
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập họ và tên:");
        String hoTen = sc.nextLine();
        System.out.println("nhập tuổi:");
        int tuoi= sc.nextInt();
        System.out.println("nhập điểm trung bình:");
        double diem =sc.nextDouble();
        
       // System.out.println("bạn tên là:"+hoTen+"." +"tuổi"+tuoi+"điểm trung bình là:"+diem);
        System.out.printf("bạn tên là:%s,tuổi :%d,diểm trung bình:%1.2f",hoTen,tuoi,diem);
    }
    
}
