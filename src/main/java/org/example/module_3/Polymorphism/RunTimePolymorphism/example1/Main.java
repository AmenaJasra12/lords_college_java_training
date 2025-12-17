package lords_college_java_training.src.main.java.org.example.module_3.Polymorphism.RunTimePolymorphism.example1;

public class Main {
    public static void main(String[] args) {
        SubClass1 obj = new SubClass1();
        obj.myFunc();
        // this is also allowed since subclass is taking reference of parentclass
        ParentClass obj1 =new SubClass1();
        obj1.myFunc();

//        ParentClass obj2 =new SubClass2();
//        obj2.myFunc();
        ParentClass obj3 =new SubClass2();
        obj3.myFunc();
    }
}
