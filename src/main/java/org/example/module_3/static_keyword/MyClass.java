package lords_college_java_training.src.main.java.org.example.module_3.static_keyword;

public class MyClass {
    public static void main(String[] args) {
        Person p1=new Person("Alice",25);
        p1.displayPersonInfo();//calls non static method using obj only
        System.out.println(p1.country);
        p1.code=5;

        Person p2=new Person("Bob",30);
        p2.displayPersonInfo();
        System.out.println(p2.country);
        System.out.println(p2.code);

        Person.display();//can directly call static method using class,without creating an obj also
    }
}
