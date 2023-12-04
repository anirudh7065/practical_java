import java.util.Arrays;
import java.util.Scanner;

public class practical24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in a array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);


        System.out.print("Enter the no to find smallest & greatest k digit to find : ");
        int k = sc.nextInt();
        int a = k;
        k = k - 1;

        System.out.print("The Smallest at " + a + " is :- ");
        for (int i = 0; i < n; i++) {
            if (i == k) {
                System.out.println(arr[i]);
            }
        }


        int[] b = new int[n];
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            b[j] = arr[i];
        }
        System.out.print("The Largest at " + a + " is :- ");
        for (int i = 0; i < n; i++) {
            if (i == k) {
                System.out.println(b[i]);
            }
        }

    }
}
