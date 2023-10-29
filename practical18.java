import java.util.Scanner;
//Program to get the greatest common divisor with euclid's algorithm
public class practical18 {
    public static int euclid(int a, int b){
        while(b!=0){
            int sum = a%b;
            a = b;
            b = sum;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two no's to 'Find Greatest Common Divisor(GCD)' : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The Greatest Common Divisor (GCD) is : "+euclid(a,b));
    }
}
