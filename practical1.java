import java.util.Scanner;
public class practical1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find the greater no");
        System.out.println("******************************");
        System.out.print("enter first no : ");
         int a = sc.nextInt();
        System.out.print("enter second no :");
         int b = sc.nextInt();
         if (a > b){
             System.out.println("A is greater");
         } else if (a==b) {
             System.out.println("A and B are same");
         }
         else{
             System.out.println("B is greater");
         }
    }
}
