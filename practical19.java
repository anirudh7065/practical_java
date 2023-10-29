import java.util.Scanner;

//Program to find the armstrong no
public class practical19 {
    public static void arm(int n){
        int temp = n;
        int rem,result = 0;
        while(n!=0){
            rem = n %10;
            result += rem*rem*rem ;
            n = n/10;
        }
        if (result == temp){
            System.out.println(temp+" is a armstrong no ");
        }else System.out.println(temp+" is not a armstrong no ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no to find the armstrong no : ");
        int n = sc.nextInt();
        arm(n);
    }
}
