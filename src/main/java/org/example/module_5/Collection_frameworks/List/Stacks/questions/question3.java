package org.example.module_5.Collection_frameworks.List.Stacks.questions;
import java.util.Stack;
public class question3 {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        // Push all characters of the string to the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversedString = new StringBuilder();
        // Pop all characters from the stack and append them to the result
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + output);
    }
}