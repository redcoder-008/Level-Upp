public class abstractclass {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.run();
        // Animal n = new Animal() ;
            
        
    }
}
abstract class Animal{
    String color;

    abstract void run();

}
class Dog extends Animal 
{
    void run()
    {
        System.out.println("Dog is running");
    }
}
