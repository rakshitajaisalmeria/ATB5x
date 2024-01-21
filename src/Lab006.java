package src;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Lab006 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x,y,z");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();

        double a= x*x;
        double b= y*y;
        double c=Math.abs(z);

        double exp= a+b-c;

        System.out.println(Math.cbrt(exp));

    }
}