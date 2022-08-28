package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int x=in.nextInt();
//        int y=in.nextInt();
//        int z=in.nextInt();
//        System.out.println(sumOfOdd(x));
        fibb(0,1,8);

    }

//    Ques->

//    Enter 3 numbers from the user & make a function to print their average.
    public static int avg(int x,int y,int z){
        return (x+y+z)/3;
    }
//    Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOfOdd(int n){
        int i=0;
        int sum=0;
        while (i<=n){
            if(i%2!=0) sum+=i;
            i++;
        }
        return sum;
    }
//    Write a function which takes in 2 numbers and returns the greater of those two.
//    Write a function that takes in the radius as input and returns the circumference of a circle.
//    Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
//    Write an infinite loop using do while condition.
//    Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
//    Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
//    Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
//    Write a program to print Fibonacci series of n terms where n is input by user :
//            0 1 1 2 3 5 8 13 21 .....
//    In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
//            (BONUS)

    public static void fibb(int a,int b,int n){
        System.out.print(a+" "+b);
        for (int i = 2; i <=n ; i++) {
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
