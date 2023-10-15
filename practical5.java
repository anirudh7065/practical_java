import java.util.Scanner;
public class practical5 {
    public static void main(String[] args){
        int  f = 1;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing factorial of a no with do while");
        System.out.println("****************************************");
        System.out.print("Enter the no to get the factorial :");
        a = sc.nextInt();
        int temp = a;
        do{
            f *= a;
            a--;
        }while(a>0);
        System.out.println("the factorial of "+temp+" is " +f);
    }
}
