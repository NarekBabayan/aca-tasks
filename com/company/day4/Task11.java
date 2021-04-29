package com.company.day4;

import javax.swing.text.Style;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

     //a > 10 and b is not equal to 10

        if(a>10){
            System.out.println("a is legal");
            if (b!=10){
                System.out.println("b is legal");
            }else{
                System.out.println("b is not legal");
            }
        }

        if(a<=10){
            System.out.println("a is not legal");
            if (b!=10){
                System.out.println("b is legal");
            }else{
                System.out.println("b is not legal");
            }
        }

     //both a and b is positive

         if(a<0){
             System.out.println("a is not legal");
             if(b<0){
                 System.out.println("b is not legal");
             }else{
                 System.out.println("b is  legal");
             }
         }

         if (a>0){
             System.out.println("a is  legal");
             if(b<0){
                 System.out.println("b is not legal");
             }else{
                 System.out.println("b is  legal");
             }
         }

         //a > 10 b < 1 both of them are odd

        if (a>10 && a%2!=0){
            System.out.println("a is legal");
            if(b<1 && b%2!=0){
                System.out.println("b is legal");
            }else{
                System.out.println("b is not legal");
            }
        }

        if (!(a>10 && a%2!=0)){
            System.out.println("a is not legal");
            if(b<1 && b%2!=0){
                System.out.println("b is legal");
            }else{
                System.out.println("b is not legal");
            }
        }




    }
}