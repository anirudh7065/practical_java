import java.util.Scanner;

public class practical14 {
    //for checking ascending
    public static void checkAsc(int[] a , int n){
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            try {
                if (a[i] < a[i + 1]) count += 1;
            }
            catch (ArrayIndexOutOfBoundsException ignored){
            }
        }
        if (count == n-1){
            System.out.println("Its in ascending order");
        }
        else{
            System.out.println("not in ascending order");
        }
    }
    //for checking descending
    public static void checkDec(int[] a , int n){
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            try {
                if (a[i] > a[i + 1]) count += 1;
            }
            catch (ArrayIndexOutOfBoundsException ignored){
            }
        }
        if (count == n-1){
            System.out.println("Its in descending order");
        }
        else{
            System.out.println("not in descending order");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements :- ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements :- ");
        for (int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
        checkDec(a,n);
        checkAsc(a,n);

    }
}
