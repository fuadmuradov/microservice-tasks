package org.example.prototype;

public class PrototypeService {
    public static void main(String[] args) {
        Person person = new Person(1L, "Fuad", 25);
        var personFactory = new PersonFactory(person);
        var person2 = personFactory.clonePerson();
        var person3 = person2.copy();
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person.hashCode()==person2.hashCode());
    }
}
