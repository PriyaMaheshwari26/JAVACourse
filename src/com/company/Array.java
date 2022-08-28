package com.company;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Defining an array
        int[] a={10,20,60,45};

        //initialize an array
        int[] arr=new int[6];
        arr[0]=39;
        arr[1]=67;
        arr[2]=58;
        arr[4]=98;
        arr[5]=75;
        System.out.println(arr);//garbage value
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //print the array
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
