package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num>=0){
            if (num%5==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }else {
            System.out.println("write position numbers");
        }
    }
}
