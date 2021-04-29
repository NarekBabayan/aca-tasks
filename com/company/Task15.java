package com.company;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        int i=0;

        if(num1==num2 && num1==num3){
            i=3;
        }

        if(!(num1==num2 && num1==num3)){
            if(num1!=num2 && num1!=num3 && num2!=num3){
                i=0;
            }else{
                i=2;
            }
        }
        System.out.println(i);
    }
}
