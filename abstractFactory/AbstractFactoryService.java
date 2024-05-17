package org.example.abstractFactory;

import org.example.abstractFactory.bankingApp.BankingTeamFactory;
import org.example.abstractFactory.webSiteApp.WebsiteTeamFactory;

import static org.example.abstractFactory.TeamNames.BANKING;
import static org.example.abstractFactory.TeamNames.WEBSITE;

public class AbstractFactoryService {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = createTeamFactory(WEBSITE);
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
