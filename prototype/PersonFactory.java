package org.example.prototype;

public class PersonFactory {
    private Person person;
    public PersonFactory(Person person){
        this.person = person;
    }

   public Person clonePerson(){
        return (Person) person.copy();
   }

}
