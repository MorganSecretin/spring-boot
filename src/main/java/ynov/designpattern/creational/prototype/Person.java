package ynov.designpattern.creational.prototype;

public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person clone() {
        return new Person(name, age);
    }

    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
