package src;

import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter a number");
        int score=sc.nextInt();

        char grade=0;

        if (score>=90 && score <=100){
            System.out.println ("Your grade is A");
        }

        else if (score>=80 && score <90){
            System.out.println ("Your grade is B");
        }

        else if (score>=70 && score <80){
            System.out.println ("Your grade is C");
        }

        else if (score>=60 && score <70){
            System.out.println ("Your grade is D");
        }

        else {
            System.out.println ("Your grade is F");
        }




    }
}