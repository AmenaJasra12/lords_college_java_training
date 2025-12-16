package lords_college_java_training.src.main.java.org.example.module_3.static_keyword;

public class Person {
    public String name;
    public int age;
    //static variable country,code
    public static String country="USA";//remains same
    public static int code=2;
    Person(String username,int userage){
        this.name=username;
        this.age=userage;
    }
    public void displayPersonInfo(){
        System.out.println("Name: "+name+",Age: "+age);
    }
    public static void display(){
        System.out.println("this is a static method ");
    }
    //static block
    static{
        System.out.println("my static block");
    }
    //static class
    static class Address {
        public String city;
        public String state;

        Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        public void displayAddress() {
            System.out.println("City: " + city + ", State: " + state);
        }
    }
}
