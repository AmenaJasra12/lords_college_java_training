package org.example.module_5.Collection_frameworks.Queue.Deque.questions;

import java.util.ArrayDeque;
import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> input = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 3;

        //logic print first k elements
        for(Integer ele: input) {
            if(k==0) break;
            System.out.print(ele + " ");
            k--;
        }

    }
}
