package org.example.prototype;

public class PrototypeService {
    public static void main(String[] args) {
        var person = new Person(1L, "Fuad", 25);
        var personFactory = new PersonFactory(person);
        var person2 = personFactory.clonePerson();
        System.out.println(person2);
        System.out.println(person2==person);
    }
}
