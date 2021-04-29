package com.company;

public class Task3 {
    public static void main(String[] args){
        double numberRand=(double) Math.random();

        System.out.println(numberRand);

       if(numberRand<=0){
           System.out.println(2);
       }
        if(numberRand>0 && numberRand<100){
            System.out.println(3);
        }
        if(numberRand>=100 && numberRand<200){
            System.out.println(4);
        }
        if(numberRand>=200 && numberRand<300){
            System.out.println(5);
        }
        if(numberRand>=300 && numberRand<400){
            System.out.println(6);
        }
        if(numberRand>=400){
            System.out.println(7);
        }
    }
}
