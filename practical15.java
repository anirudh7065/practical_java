import java.util.Scanner;

//Program to  find if a string is a palindrome
public class practical15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter a word to check if it is palindrome : ");
        a = sc.next();
        a = a.toLowerCase();
        char[] b = a.toCharArray();
        int count = 0;
        for (int i = 0; i < b.length / 2; i++) {
            if (b[i] != b[b.length - i - 1]) {
                System.out.println("not a palindrome");
                break;
            } else count++;
        }
        if (count == b.length / 2) {
            System.out.println("Its a palindrome");
        }
    }
}
