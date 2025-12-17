package lords_college_java_training.src.main.java.org.example.module_3.Polymorphism.CompileTimePolymorphism.example1;

public class MyClass {
    //method overloading
    public void myFunc(){
        System.out.println("myFunc with no argument called");
    }
    public void myFunc(int a){
        System.out.println("myFunc with one argument called");
    }
    public void myFunc(int a,int b){
        System.out.println("myFunc with two argument called");
    }
}
