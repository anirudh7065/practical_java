import java.util.Scanner;

public class practical16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word to find its reverse : ");
        String a = sc.next();
        a = a.toLowerCase();
        char[] b = a.toCharArray();
        for (int i = b.length - 1; i >= 0; i--) System.out.print(b[i]);
    }
}
