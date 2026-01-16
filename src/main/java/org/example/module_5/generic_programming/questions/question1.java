package org.example.module_5.generic_programming.questions;

public class question1 {
    public static void main(String[] args) {
        question1 obj = new question1();
        obj.printValue(10); // 10
        obj.printValue("Hello"); // Hello
        obj.printValue(15.5); // 15.5
    }

    // create generic printValue method
    public <T> void printValue(T t) {
        System.out.println(t);
    }

    public <T> T printValue2(T t) {
        return t;
    }
}
