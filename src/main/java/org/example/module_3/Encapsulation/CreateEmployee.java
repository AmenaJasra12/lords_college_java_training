package org.example.module_3.Encapsulation;

public class CreateEmployee {
    public static void main(String[] args) {
        //create object of employee
        Employee emp = new Employee();
        emp.name="John Doe";
        //emp.empId=101;can be used when acess modifier is public empid
        emp.setEmpId(102);
        emp.displayInfo();
    }
}
