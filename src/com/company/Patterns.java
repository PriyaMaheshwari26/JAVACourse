package com.company;

public class Patterns {
    public static void main(String[] args) {
        int row=5;
        int col=5;

        //Solid rectangle
//        for (int i = 0; i <row ; i++) {
//            for (int j = 0; j <col; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        System.out.println();
//        System.out.println();

        //Hollow Rectangle
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col; j++) {
                if(i==0||j==0||i==row-1||j==col-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        //Half Triangle
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = row; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int i = 1; i <=row; i++) {
            //inner loop-> to print spaces
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //Half pyramid with numbers
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //Half pyramid with numbers
        for (int i = row; i >=0; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //Half pyramid with numbers
        int num=1;
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
