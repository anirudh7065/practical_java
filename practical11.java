import java.util.Scanner;
import java.util.Arrays;
public class practical11 {
    public static void main(String[] args){
        System.out.println("Program to get sorted array using Array sort and Array package");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements to enter : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements : ");
        for (int i =0 ; i <n ; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Sorted array in ascending order :");
        for (int i =0 ; i <n ; i++){
            System.out.print(a[i]+",");
        }
    }
}
