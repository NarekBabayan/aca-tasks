package com.company.day4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        if(num>=1 && num<=7){
            if(num==1){
                System.out.println("erkushabti");
            }
            if(num==2){
                System.out.println("erekshabti");
            }
            if(num==3){
                System.out.println("choreqshabti");
            }
            if(num==4){
                System.out.println("hingshabti");
            }
            if(num==5){
                System.out.println("urbat");
            }
            if(num==6){
                System.out.println("shabat");
            }
            if(num==7){
                System.out.println("kiraki");
            }
        }else{
            System.out.println("write 1-> 7 range numbers");
        }
    }
}
