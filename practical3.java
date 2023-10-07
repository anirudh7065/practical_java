import java.util.Scanner;

public class practical3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print pyramid design");
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++){
            for (int k = n-i; k>0 ; k--) {
                System.out.print(" ");
            }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
