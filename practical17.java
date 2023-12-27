import java.util.Scanner;

//Remove vowels from a string
public class practical17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String a = sc.next();
        a = a.toLowerCase();
        char[] b = a.toCharArray();
        System.out.print("String after removing vowels : ");
        for (int i = 0; i < b.length; i++) {
            try {
                if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u') {
                    i++;
                    System.out.print(b[i]);
                } else System.out.print(b[i]);
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }
        }
    }
}
