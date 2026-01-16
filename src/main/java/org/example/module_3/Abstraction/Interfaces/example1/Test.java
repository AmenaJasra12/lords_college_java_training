package org.example.module_3.Abstraction.Interfaces.example1;

import org.example.module_3.Abstraction.abstractClass.example2.Ac;
import org.example.module_3.Abstraction.abstractClass.example2.Remote;
import org.example.module_3.Abstraction.abstractClass.example2.Tv;

public class Test {
    public static void main(String[] args) {
        Remote o1=new Tv();
        Remote o2=new Ac();

        doWork(o1);
        doWork(o2);
    }
    public static void doWork(Remote obj){
        obj.turnOn();
        obj.turnOff();
    }
}
