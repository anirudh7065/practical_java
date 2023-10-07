import java.util.Scanner;

public class practical10 {
    public static int fact(int a){
        if(a==0 || a==1){
            return 1;
        }
        else {
            return a*fact(a-1);
        }
    }
    public static int add(int a){
        if(a==0){
            return 0;
        }
        else{
            return a+add(a-1);
        }
    }
    private static int temp = 1;
    public static int count(int a){
        if(temp == a){
            return a;
        }
        else{
            System.out.println(temp);
            temp++;
        }

        return count(a);
    }
    public static void main(String[] args) {
        System.out.println("Program of recursion");
        System.out.println("*********************");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NO TO FIND FACTORIAL");
        int a = sc.nextInt();
        System.out.println(count(a));
    }

}
