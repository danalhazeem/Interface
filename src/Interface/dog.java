package Interface;
public class dog implements Animal{
    public void eat() {
        System.out.println("Dog is eaings");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void makeSound() {
        System.out.println("Dog says: woof!");
    }
}