import java.util.Scanner;

public class practical20 {
    //Floyd's Triangle Algorithm
    public static void floyd(int n){
        int num = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no to make Floyd's Triangle : ");
        int n = sc.nextInt();
        floyd(n);
    }
}
