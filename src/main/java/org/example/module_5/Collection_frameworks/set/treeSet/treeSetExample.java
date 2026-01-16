package org.example.module_5.Collection_frameworks.set.treeSet;

import java.util.TreeSet;

public class treeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> mySet = new TreeSet<>();

        mySet.add(5);
        mySet.add(7);
        mySet.add(1);
        mySet.add(0);
        mySet.add(3);
        System.out.println("TreeSet after adding elements: " + mySet);

    }
}
