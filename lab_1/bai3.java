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
public class bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh khối lập phương");
        double canh =sc.nextDouble();
        System.out.println("thể tích lập phương là:" +Math.pow(canh,3));
    }
    
}
