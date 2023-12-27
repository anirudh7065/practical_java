import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practical25 {
    public static void DecimalToBinary(int a) {
        int rem;
        List<Integer> b = new ArrayList<>();
        while (a != 0) {
            rem = a % 2;
            b.add(rem);
            a = a / 2;
        }
        System.out.print("The binary digit is :- (");
        for (int element : b.reversed()) {
            System.out.print(element);
        }
        System.out.println(")₂");
    }

    public static void DecimalToOctal(int a) {
        int rem;
        List<Integer> b = new ArrayList<>();
        while (a != 0) {
            rem = a % 8;
            b.add(rem);
            a = a / 8;
        }
        System.out.print("The Octal digit is :- (");
        for (int element : b.reversed()) {
            System.out.print(element);
        }
        System.out.println(")₈");
    }

    public static void DecimalToHex(int a) {
        int rem;
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        List<Character> b = new ArrayList<>();
        while (a != 0) {
            rem = a % 16;
            b.add(hex[rem]);
            a = a / 16;
        }
        System.out.print("The Hex-Decimal digit is :- (");
        for (char element : b.reversed()) {
            System.out.print(element);
        }
        System.out.println(")₁₆");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the action to perform :- \n1) Decimal To Binary\n2) Decimal To Octal\n3) Decimal To Hex-Decimal\nSelect the option to perform between (1-3) :- ");
        int b = sc.nextInt();
        if (b == 1) {
            System.out.print("Enter the decimal no to get its Binary :- ");
            int a = sc.nextInt();
            DecimalToBinary(a);
        } else if (b == 2) {
            System.out.print("Enter the decimal no to get its Octal :- ");
            int a = sc.nextInt();
            DecimalToOctal(a);
        } else if (b == 3) {
            System.out.print("Enter the decimal no to get its Hex-Decimal :- ");
            int a = sc.nextInt();
            DecimalToHex(a);
        }
    }
}
