package uk.co.datadisk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Main_Reflection_4 {

    public static void main(String[] args) {

        Class pc = null;

        try {
            pc = Class.forName("uk.co.datadisk.Person4");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Method[] methods = pc.getMethods();

        for(Method method : methods){
            if(method.isAnnotationPresent(MyAnnotation.class)){
                System.out.println(method.getName());
            }
        }

    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String name();                   // this is the argument name passed to @MyAnnotation
}

class Person4 {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    @MyAnnotation(name="MyAnnotation")      // name is used by the name method in @MyAnnotation
    public String returnName() {
        return this.name;
    }
}


