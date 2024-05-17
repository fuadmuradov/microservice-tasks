package org.example.abstractFactory.bankingApp;

import org.example.abstractFactory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Manage Banking App Project");
    }
}
