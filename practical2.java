import java.util.Scanner;

public class practical2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find if the no is positive or negative ");
        System.out.println("**************************************************");
        System.out.print("Enter a no : ");
        int a = sc.nextInt();
        if ( a > 0){
            System.out.println("It is positive");
        }
        else if(a<0){
            System.out.println("It is negative");
        }
        else{
            System.out.println("It is zero");
        }

    }
}
