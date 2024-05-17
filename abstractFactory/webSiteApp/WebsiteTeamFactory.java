package org.example.abstractFactory.webSiteApp;

import org.example.abstractFactory.ProductOwner;
import org.example.abstractFactory.ProjectTeamFactory;
import org.example.abstractFactory.Tester;
import org.example.factory.Developer;
import org.example.factory.KotlinDeveloper;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }

    @Override
    public ProductOwner createProductOwner() {
        return new WebsitePO();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }
}
