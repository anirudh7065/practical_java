import java.util.Scanner;

public class practical13 {
    //func to calculate the average of an array of no's
    public static void avg(int n, int[] a){
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += a[i];
        }
        int avg = sum/n;
        System.out.println("the sum of the array is : "+ sum);
        System.out.println("the average of the array is : "+ avg);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of elements :- ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of the array :- ");
        for (int i = 0 ; i< n ; i++){
            a[i] = sc.nextInt();
        }
        avg(n,a);
    }
}
