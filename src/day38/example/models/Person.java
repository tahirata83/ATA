package day38.example.models;

public class Person {

    //public to field/attribute
    public String name;

    //public to constructor
    public Person() {
        System.out.println("In Default Constructor");
    }

    //public to method
    public String giveMeName() {
        return name;
    }

    //public to method
    public void printDetails() {
        System.out.println("Some details");
    }

    public Person(String techno) {
    }

    public void setName(String techno) {
    }

     public String getName() {
         return null;
     }
}