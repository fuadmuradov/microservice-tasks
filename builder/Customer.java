package org.example.builder;

public class Customer {
    private Long id;
    private String name;
    private String surname;
    public Customer(CustomerBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.Surname;
        this.age = builder.Age;
    }

    private Integer age;
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public static CustomerBuilder builder(){
        return new CustomerBuilder();
    }

    static class CustomerBuilder{
        private Long id;
        private String name;
        private String Surname;
        private Integer Age;

        public CustomerBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder setSurname(String surname) {
            Surname = surname;
            return this;
        }

        public CustomerBuilder setAge(Integer age) {
            Age = age;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
