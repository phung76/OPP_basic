/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author NGOC PHUNG
 */
public class bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập phương trình Ax^2+Bx+c=0");
        System.out.println("nhập số a");
        float a =sc.nextFloat();
        System.out.println("nhập số b");
        float b= sc.nextFloat();
        System.out.println("nhập số c");
        float c =sc.nextFloat();
        
        
        double detal= Math.pow(b, 2)-4*a*c;
       if(a==0){
           if(b==0){
               if(c==0){
                   System.out.println("phương trinh vô số nghiệm");
                   
               }
               else
               {
                    System.out.println("phương trình vô nghiệm");
               }
           }
           else
           {
               System.out.println("phương trình có một nghiệm:"+(-c/b));
           }
           
       }
       else{
           if(detal>0){
               System.out.println("phương trình có hai nghiệm:");
               System.out.println("x1"+(-b+ Math.sqrt(detal))/(2+a));
               System.out.println("x2"+(-b- Math.sqrt(detal))/(2+a));
           }
           else if(detal==0){
               System.out.println("phương trinh có nghiệm kep: x1=x2"+(-b/(2*a)));
               
           }
           else if(detal<0){
               System.out.println(" phương trình vô nghiệm");
           }
               
       }
      
        
        System.out.println("detal:"+detal);
        
        
        
    }
    
}
