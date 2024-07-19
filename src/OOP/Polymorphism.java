package OOP;

// overloading - compile time polymorphism
// overriding - runtime polymorphism

// Class to demonstrate method overloading
class Animal {
    // Overloaded methods
    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    void makeSound(String sound) {
        System.out.println(sound);
    }
}

// Class to demonstrate method overriding
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    // Overloaded methods in the subclass
    void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Bark");
        }
    }

    void makeSound(String sound, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(sound);
        }
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        // Calling overloaded methods in Animal class
        myAnimal.makeSound();
        myAnimal.makeSound("Roar");

        // Calling overridden method in Dog class
        myDog.makeSound();

        // Calling overloaded methods in Dog class
        myDog.makeSound(3);
        myDog.makeSound("Woof", 2);

        // Demonstrating polymorphism
        Animal polyAnimal = new Dog();
        polyAnimal.makeSound(); // This will call the overridden method in Dog class
    }
}
