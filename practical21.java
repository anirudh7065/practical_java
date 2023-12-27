import java.util.Scanner;

public class practical21 {
    //    Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
    public static boolean isvowel(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        try {
            if (isvowel(a)) {
                System.out.println("Found");
            } else throw new NoVowelsException("no vowel");
        } catch (NoVowelsException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static class NoVowelsException extends Exception {
        public NoVowelsException(String mess) {
            super(mess);
        }
    }
}
