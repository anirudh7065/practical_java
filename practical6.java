public class practical6 {
    public static void main(String[] args ){
        System.out.println("Program to show exception handling 1");
        try{
            //there is no error, so it will print try block then finally block and then program continued but will exempt catch block
            int a = 100/5;
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

