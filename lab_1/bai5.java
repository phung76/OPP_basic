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
public class bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập số a,b,c");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        
     int max=a;
     if(a>max){
         max=a;
     }
     if(b>max){
         max=b;
     }
     if(c>max){
          max=c;
         
     }
     if(d>max){
          max=d;
     }
        System.out.println("max la"+max);
     
     
    }
    
}
