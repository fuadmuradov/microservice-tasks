package org.example.prototype;

public class Person implements VersionControl{
    private Long id;
    private String name;
    private Integer age;

    public Person(Long id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public Object copy() {
        return new Person(id, name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
