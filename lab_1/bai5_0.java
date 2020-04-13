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
public class bai5_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm:");
        float a =sc.nextFloat();
        
        if((a<=10)&&(a>=9)){
            System.out.println("sinh viên suất sắc");
        }
        else if((a<9)&&(a>=8)){
            System.out.println("sinh viên giỏi");
        }
        else if((a<8)&&(a>=7)){
            System.out.println("sinh viên khá");
        }
        else if((a<7)&&(a>=5)){
            System.out.println("sinh viên trung bình");
        }
        else if((a<5)&&(a>=4)){
            System.out.println("sinh viên yếu");
        }
        else if(a<4){
            System.out.println("sinh viên kém");
        }
            
    }
    
}
