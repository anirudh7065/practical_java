//Program of implementing multithreading by implementing Runnable
public class practical9 implements Runnable{
    private final int thread1;
    public practical9(int a){
        thread1 = a;
    }
    @Override
    public void run() {
        for (int i = 0 ; i < 3 ; i++) {
            System.out.println(i + "this is from "+ thread1);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Program of implementing multithreading by extending class");
        for (int i = 0  ; i < 3 ; i++) {
            practical9 t1 = new practical9(i);
            Thread myThread = new Thread(t1);
            myThread.start();
        }
    }

}

