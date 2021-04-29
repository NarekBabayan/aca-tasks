package com.company;

import javax.swing.text.Style;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        int max;

        if(num1>=num2){
            max=num1;
        }else{
            max=num2;
        }

        if(max>=num3){
            max=max;
        }else {
            max=num3;
        }

       if(num1==max){
           if(num2<num3){
               System.out.println(num2);
               System.out.println(num3);
               System.out.println(max);
           }else {
               System.out.println(num3);
               System.out.println(num2);
               System.out.println(max);
           }
       }

        if(num2==max){
            if(num1<num3){
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(max);
            }else {
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(max);
            }
        }

        if(num3==max){
            if(num2<num1){
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(max);
            }else {
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(max);
            }
        }


    }
}
