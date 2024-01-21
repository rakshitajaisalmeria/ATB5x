package src;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of the triangle");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        if (A==B && A==C){
            System.out.println("Triangle is equilateral");
        }

        else if(A==B || A==C || B==C){
            System.out.println("Triangle is isosceles");
        }

        else{
            System.out.println("Triangle is Scalene");
        }

    }
}