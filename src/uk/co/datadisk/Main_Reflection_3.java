package uk.co.datadisk;

import java.io.Serializable;

public class Main_Reflection_3 {

    public static void main(String[] args) {

        Class pc = null;

        try {
            pc = Class.forName("uk.co.datadisk.Person3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Super Class: " + pc.getSuperclass().getName());

        System.out.println("--------- Interfaces -------------------");
        Class[] interfaces = pc.getInterfaces();
        for (Class inter : interfaces){
            System.out.println("  " + inter.getName());
        }

    }
}

class Employee {

}

class Person3 extends Employee implements Serializable, Comparable<Person3> {

    @Override
    public int compareTo(Person3 o) {
        return 0;
    }
}


