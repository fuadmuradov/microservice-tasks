package org.example.abstractFactory.webSiteApp;

import org.example.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Test WebSite Component");
    }
}
