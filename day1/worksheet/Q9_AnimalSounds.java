package day1.worksheet;
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();  // Call base class method
        System.out.println("Cat says: Meow!");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();  // Call base class method
        System.out.println("Dog says: Woof!");
    }
}

public class Q9_AnimalSounds {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        System.out.println("Cat:");
        myCat.makeSound();

        System.out.println("\nDog:");
        myDog.makeSound();
    }
}
