package uk.co.datadisk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main_Reflection_2 {

    public static void main(String[] args) {

        Class pc = null;

        try {
            pc = Class.forName("uk.co.datadisk.Person2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("--------- Package -------------------");
        System.out.println(pc.getPackage());

        // Accessing public fields via reflection
        System.out.println("--------- Public Fields -------------------");
        Field[] fields = pc.getFields();
        for(Field field : fields){
            System.out.println("  " + field.getName());
        }

        // Accessing public methods via reflection
        System.out.println("--------- Public Methods -------------------");
        Method[] methods = pc.getMethods();
        for(Method method : methods){
            System.out.println("  " + method.getName());
        }

        // Getting All fields
        System.out.println("-------------- All Fields -----------------");
        Field[] fieldsAll = pc.getDeclaredFields();
        for(Field field : fieldsAll){
            field.setAccessible(true);
            System.out.println("  " + field.getName());
        }

        // Getting All methods
        System.out.println("-------------- All Methods -----------------");
        Method[] methodsAll = pc.getDeclaredMethods();
        for(Method method :methodsAll){
            method.setAccessible(true);
            System.out.println("  " + method.getName());
        }
    }
}

class Person2 {
    private String firstName;
    public String lastName;
    protected int age;
    String birthCountry;                // package protected

    private void meth1(){}
    public void meth2(){}
    protected void meth3(){}
    void meth4(){}                      // package protected
}