package org.example.module_3.this_reference_variable;

public class CallDiffConstructorUsingThis {
    CallDiffConstructorUsingThis(){
        //this("alice");//error comes if we pass more than 1 parameters
        this("alice", "engineer");
        System.out.println("Default Constructor called");
    }
    CallDiffConstructorUsingThis(String name){
        this(name, "engineer");
        System.out.println("Constructor with name: "+name);
    }
    CallDiffConstructorUsingThis(String name, String profession) {
        System.out.println("Constructor with name: " + name + " and profession: " + profession);
    }
    public static void main(String[] args){
        //CallDiffConstructorUsingThis obj = new CallDiffConstructorUsingThis("alice");//calls default if no parameters are passed
        CallDiffConstructorUsingThis obj = new CallDiffConstructorUsingThis();
    }
}
