import java.util.Arrays;
import java.util.Scanner;

public class practical23 {
    // Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in a array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the no of greatest digits to find : ");
        int k = sc.nextInt();
        System.out.print("The largest " + k + " digits are :-");
        for (int i = n - 1; i >= 0; i--) {
            if (k != 0) {
                System.out.print(arr[i] + ",");
            } else {
                return;
            }
            k--;
        }
    }
}
