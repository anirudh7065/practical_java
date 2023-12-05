import java.util.Scanner;

import static java.lang.Math.sqrt;

public class practical26 {
    //    Program to calculate roots of Quadratic Equation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to calculate roots of Quadratic Equation");
        System.out.println("-------------------------------------------------");
        System.out.print("Enter the value of x² : - ");
        int a = sc.nextInt();
        System.out.print("Enter the value of x  : - ");
        int b = sc.nextInt();
        System.out.print("Enter the value of constant : - ");
        int c = sc.nextInt();
        double xplus = (-b + sqrt((b * b) - (4 * a * c))) / 2 * a;
        double xminus = (-b - sqrt((b * b) - (4 * a * c))) / 2 * a;
        System.out.println("The roots of x are :- x = " + xplus + " and x = " + xminus);
    }
}
