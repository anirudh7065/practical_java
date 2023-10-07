public class practical7 {
    public static void main(String[] args ){
        System.out.println("Program to show exception handling 2");
        try{
            //there is exception, so it will print catch block then finally block and then program continued but will exempt try block
            int a = 100/0;
            System.out.println(a);
        }
        catch (ArithmeticException j){
            System.out.println("Arithmetic exception -> "+ j.getMessage());
        }
        finally{
            System.out.println("the is finally block");
        }
        System.out.println("program continued");
    }
}
