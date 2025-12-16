package lords_college_java_training.src.main.java.org.example.module_3.Encapsulation;

public class Employee {
    public String name;
    private int empId;//acessible only inside this class
    public void displayInfo(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+empId);
        privateMethod();
    }
    //public method for private acess modifier
    public void setEmpId(int id){
        this.empId=id;
    }
    //if method becomes private then it cannot be called outside the class but inside another method
    private void privateMethod(){
        System.out.println("Private method");
    }
}
