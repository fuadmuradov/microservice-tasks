package org.example.abstractFactory.bankingApp;

import org.example.abstractFactory.ProductOwner;
import org.example.abstractFactory.ProjectTeamFactory;
import org.example.abstractFactory.Tester;
import org.example.factory.Developer;
import org.example.factory.JavaDeveloper;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProductOwner createProductOwner() {
        return new BankingPO();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }
}
