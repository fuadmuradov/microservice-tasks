package org.example.builder;

public class CustomerService {
    public static void main(String[] args) {
        Customer customer = new Customer.CustomerBuilder()
                .setId(5L).setName("Fuad").setAge(24).build();
        System.out.println(customer.toString());

    }
}
