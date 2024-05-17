package org.example.abstractFactory.webSiteApp;

import org.example.abstractFactory.ProductOwner;

public class WebsitePO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Manage Web App Product fully");
    }
}
