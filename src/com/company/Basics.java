package com.company;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {
	// write your code here
        //Output in JAVA
        System.out.println("Hello World"); //Print with a new line
        System.out.println("Hello World");

        System.out.print("Hello World"); //Without new line
        System.out.print("Hello World");

        System.out.print("Hello World\nThis is Priya\n"); //Add a new line


        //Printing a pattern
//        *
//        **
//        ***
//        ****
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");


        //printing above pattern in one line
        System.out.println("*\n**\n***\n****");

        //Primitive Data Types-->byte,int,char,float,double,long, boolean


        //Variables in JAVA
        int a=8;
        String s="JAVA";
        double price=69.8;

        //We can change the value of var
        a=9;
        s="Hello";
        System.out.println(a+" "+s);

        //quizz--> solve ab/a-b
        int x=10;
        int y=5;
        int ans=x*y/x-y;
        int res=(x*y)/(x-y);
        System.out.println(ans+" "+res);

        //User Input in JAVA
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();//Only a single word
        System.out.println(name);
        String str=sc.nextLine();//Input full line
        System.out.println(str);
        //nextInt()
        //nextFloat()....


        //Input two var and print the sum
        System.out.println("Enter Two numbers");
        int num1=sc.nextByte();
        int num2=sc.nextByte();
        System.out.println("The sum is: "+num1+num2);


    }
}
