package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleace write your satur");
        int saturn=scanner.nextInt();
        if(saturn==0){
            System.out.println("you are dad");
        }
        if (saturn>0 && saturn<=30){
            System.out.println("extremely bad");
        }
        if (saturn>30 && saturn<=50){
            System.out.println("bad");
        }
        if (saturn>50 && saturn<=70){
            System.out.println("normal");
        }
        if (saturn>70 && saturn<=100){
            System.out.println("good");
        }else{
            System.out.println("write 0-100 range numbers");
        }
    }
}
