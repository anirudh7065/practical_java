abstract class animal{
    abstract void sound();
}

class Lion extends animal{
    @Override
    public void sound(){
        System.out.println("Roar...Roar..!!");
    }
}
class Tiger extends animal{
    @Override
    public void sound(){
        System.out.println("Grr..Grr..!!");
    }
}
public class practical22 {
//    Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

    public static void main(String[] args){
        Lion a = new Lion();
        Tiger b = new Tiger();
        a.sound();
        b.sound();
    }
}
