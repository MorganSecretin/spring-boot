package ynov.designpattern.creational.prototype;

public class App {
    public static void main(String[] args) {
        System.out.println();
        
        Person person1 = new Person("John", 25);
        System.out.println("person1 = " + person1);
        Person person2 = person1;
        System.out.println("person2 = person1; " + person2);
        Person person3 = person1.clone();
        System.out.println("person3 = person1.clone(); " + person3);
        
        System.out.println("person1 == person2: " + (person1 == person2));
        System.out.println("person1 == person3: " + (person1 == person3));
    }
}
