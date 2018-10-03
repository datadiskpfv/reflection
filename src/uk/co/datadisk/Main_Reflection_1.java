package uk.co.datadisk;

public class Main_Reflection_1 {

    public static void main(String[] args) {

        // Two ways to get class name
        Class<Person1> pc1 = Person1.class;
        System.out.println(pc1.getName());

        try {
            Class pc2 = Class.forName("uk.co.datadisk.Person1");
            System.out.println(pc2.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person1 {

}
