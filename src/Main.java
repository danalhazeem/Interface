import Interface.*;
public class Main {

        public static void main(String[] args) {
            // Instantiate Dog and Cat objects
            Animal dog = new dog();
            Animal cat = new cat();

            // Call methods on Dog
            System.out.println("Dog Actions:");
            dog.eat();
            dog.sleep();
            dog.makeSound();

            // Call methods on Cat
            System.out.println("\nCat Actions:");
            cat.eat();
            cat.sleep();
            cat.makeSound();
        }


}