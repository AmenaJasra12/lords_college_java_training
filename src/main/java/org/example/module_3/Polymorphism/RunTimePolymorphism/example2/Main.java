package org.example.module_3.Polymorphism.RunTimePolymorphism.example2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();

//        Cat  animal1=new Cat();
//        animal1.makeSound();

        Dog animal2 = new Dog();
        animal2.makeSound();
    }
}
