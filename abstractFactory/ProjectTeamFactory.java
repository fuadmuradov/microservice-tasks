package org.example.abstractFactory;

import org.example.factory.Developer;

public interface ProjectTeamFactory {
    Developer createDeveloper();
    ProductOwner createProductOwner();
    Tester createTester();
}
