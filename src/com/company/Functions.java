package com.company;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        System.out.println("Enter a name");
//        String name=in.nextLine();
//        printName(name);
//        System.out.println(sum(5,9));
//        int product=product(4,6);
//        System.out.println(product);
        System.out.println("Enter a number");
        int n=in.nextInt();
//        fact(n);
//        System.out.println(checkPrime(n));
//        System.out.println(isEven(n));

        printTable(n);
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static int sum(int x,int y){
        return (x+y);
    }
    public static int product(int x,int y){
        return (x*y);
    }

    public static void fact(int n){
        int fact=1;
        for (int i = n ;i >=1 ; i--) {
            fact=fact*i;
        }
        System.out.println(fact);

    }

//    Make a function to check if a number is prime or not
    public static boolean checkPrime(int n){
        for (int i = 2; i*i <= n/2; i++) {
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

//    Make a function to check if a given number n is even or not.
        public static boolean isEven(int n){
        if(n%2==0) return true;
        return false;
        }

//    Make a function to print the table of a given number n.
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }

}
