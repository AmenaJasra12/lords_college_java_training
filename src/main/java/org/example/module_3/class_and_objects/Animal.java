package org.example.module_3.class_and_objects;

public class Animal {
    // create attributes of Animal
    String name;
    String sound;
    // create method of Animal
    public void makeSound() {
        System.out.println(this.name + " says: " + this.sound);
    }
    public static void main(String[] args) {
        // Create object of animal as dog
        Animal dog = new Animal();
        dog.name = "Buddy";
        dog.sound = "Bark!";

        // Create object of animal as cat
        Animal cat = new Animal();
        cat.name = "Whiskers";
        cat.sound = "Meow!";
        System.out.println("Let's hear what the animals say:");
        dog.makeSound();
        cat.makeSound();
    }
}
