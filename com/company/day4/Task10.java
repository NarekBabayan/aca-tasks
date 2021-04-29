package com.company.day4;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean myValue;

        int num = scanner.nextInt();
         if((num>-1000 && num<1000) && (num%3==0 || num%5==0)){
              myValue=true;
         }else{
             myValue=false;
         }
        System.out.println(myValue);
    }
}
