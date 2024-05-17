package org.example.prototype;

public class PrototypeService {
    public static void main(String[] args) {
        Person person = new Person(1L, "Fuad", 25);
        PersonFactory personFactory = new PersonFactory(person);
        Person person2 = personFactory.clonePerson();
        System.out.println(person2);
        System.out.println(person2==person);
    }
}
