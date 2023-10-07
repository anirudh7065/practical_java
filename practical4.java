import java.util.Scanner;

public class practical4 {
    public static void main(String[] args){
        int i = 1 ;
        int n = 10 ;
        int a;
        System.out.println("To get the table of any number till 10");
        System.out.println("**************************************");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no to get its table : ");
        a = sc.nextInt();
        while(i<=n){
            System.out.println(a+" X "+i+" = "+(a*i));
            i++;
        }
    }
}
