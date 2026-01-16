package org.example.module_3.this_reference_variable;

public class ThisReferenceVariable {
    int age;//global variable
    void printAge(){
        int age=30;//local variable
        //without creating an obj this method cannot be called
        System.out.println("Age is: "+this.age);
        System.out.println("Age is: "+age);//refers local variable age if exist
    }
    public static void main(String[] args) {
        ThisReferenceVariable obj = new ThisReferenceVariable();
        obj.age=21;
        obj.printAge();

        ThisReferenceVariable obj2 = new ThisReferenceVariable();
        obj2.age=25;
        obj2.printAge();

    }
}
