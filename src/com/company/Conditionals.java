package com.company;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //If-Else
//        if(8>7){
//            //Statement
//            System.out.println(8);
//        }
//        else{
//            System.out.println(7);
//        }
//
//        //Check even odd
//
        Scanner in = new Scanner(System.in);
        int x = in.nextByte();
//        if(x%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//
//        //Nested if-else
        int y = in.nextByte();
//        if(x==y){
//            System.out.println("equal");
//        }
//        else {
//            if(x>y) System.out.println("x is greater");
//            else System.out.println("x is lesser");
//        }
//
//        //if - else if - else
//        if(x==y)System.out.println("Equal ");
//        else if(x>y) System.out.println("x is greater");
//        else System.out.println("x is lesser");


        //Note
        if (x == y) ;//will terminate here
        System.out.println("Equal");//will always run

        if (x == 1) System.out.println("Hello");
        else if (x == 2) System.out.println("Namashte");
        else if (x == 3) System.out.println("Hola");
        else System.out.println("Invalid");

        //We can do the above task using switch statement more efficiently
    }
}