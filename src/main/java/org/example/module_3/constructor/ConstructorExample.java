package lords_college_java_training.src.main.java.org.example.module_3.constructor;

public class ConstructorExample {
    public static void main(String[] args) {
        Person person1=new Person("John",25);
        person1.printPerson();
//      person1.name="Jasra";
//      person1.age=21;
    }
}
class Person{
    String name;
    int age;
    //constructor method default
    Person(){
        System.out.println("Constructor called");
    }
    //constructor with parameters
    Person(String userName,int userAge){
        name=userName;
        age=userAge;
    }
    void printPerson(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}