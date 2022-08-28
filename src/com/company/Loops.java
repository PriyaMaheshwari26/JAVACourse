package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //for Loop
//        for(initialisation;condition;updation)

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello World");
//        }
//
//        //Print 1-10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        //While Loop
        int i=1;
//        while (i<10){
//            System.out.println(i);
//            i++;
//        }

        //do-while
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while (i<10);


        //Print the sum of n natural numbers
        int sum=0;
//        for (int j = 1; j <=10; j++) {
//            sum+=j;
//        }
//        while (i<=10){
//            sum+=i;
//            i++;
//        }
//        do{
//            sum+=i;
//            i++;
//        }
//        while (i<=10);
//        System.out.println(sum);

//        print the table of a number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
//        for (int j = 1; j <=10; j++) {
//            System.out.println(x+" * "+j+" = "+x*j);
//        }
//
        //Print all even numbers till n.
        for (int j = 0; j <=x ; j++) {
            if(j%2==0) System.out.print(j+" ");
        }
    }
}

