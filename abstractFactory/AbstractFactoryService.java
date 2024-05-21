package org.example.abstractFactory;

import org.example.abstractFactory.bankingApp.BankingTeamFactory;
import org.example.abstractFactory.webSiteApp.WebsiteTeamFactory;

import static org.example.abstractFactory.TeamNames.BANKING;

public class AbstractFactoryService {
    public static void main(String[] args) {
        var projectTeamFactory = createTeamFactory(BANKING);
        var developer= projectTeamFactory.createDeveloper();
        var prOwner = projectTeamFactory.createProductOwner();
        var tester = projectTeamFactory.createTester();

        System.out.println("team Participants");
        developer.writeCode();
        prOwner.manageProduct();
        tester.testCode();
    }
    public static ProjectTeamFactory createTeamFactory(TeamNames teamNames){
        return switch (teamNames){
            case BANKING -> new BankingTeamFactory();
            case WEBSITE -> new WebsiteTeamFactory();
        };
    }
}
