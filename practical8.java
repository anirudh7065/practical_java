//Program of implementing multithreading by extending class
public class practical8 extends Thread{
    private final int thread1;
    public practical8(int a){
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
        for (int i = 0  ; i < 3; i++) {
            practical8 t1 = new practical8(i);
            t1.start();
        }


    }

}
