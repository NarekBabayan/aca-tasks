package com.company.day4;

import javax.swing.text.Style;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();

         if (num>0) {
             if (num != 1 || num != 2 || num != 4 || num != 7) {
                 System.out.println("yes");
             }
         }else {
             System.out.println("write positive number");
         }
    }
}
