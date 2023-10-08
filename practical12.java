import java.util.Scanner;
public class practical12 {
    public static class first{
        void add(int a, int b){
            System.out.println("the addition of "+a+" and "+b+" is "+(a+b));
        }
    }
    public static class second extends first{
        void sub(int a, int b){
            System.out.println("the subtraction of "+a+" and "+b+" is "+(a-b));
        }
    }
    public static class third extends second{
        void mul(int a, int b){
            System.out.println("the multiplication of "+a+" and "+b+" is "+(a*b));
        }
    }
    public static class fourth extends third{
        void div(int a, int b){
            float c = (float) a /b;
            System.out.println("the subtraction of "+a+" and "+b+" is "+c);
        }
    }
    public static void main(String[] args){
        System.out.println("Program for simple calculator");
        Scanner sc = new Scanner(System.in);
        fourth obj = new fourth();
        int a,b;
        int c;
        System.out.print("Enter first no :");
        a = sc.nextInt();
        System.out.print("Enter second no :");
        b = sc.nextInt();
        System.out.println("Enter the operator to perform between them :");
        System.out.println("for addition press 1");
        System.out.println("for subtraction press 2");
        System.out.println("for multiplication press 3");
        System.out.println("for division press 4");
        System.out.print("enter the no: ");
        c = sc.nextInt();
        System.out.println();
        switch (c){
            case 1 :
                obj.add(a,b);
                break;
            case 2 :
                obj.sub(a,b);
                break;
            case 3 :
                obj.mul(a,b);
                break;
            case 4 :
                obj.div(a,b);
                break;
            default:
                System.out.println("Enter valid input!!");
        }
    }
}
