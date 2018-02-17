package ua.com.stolkacha.pageElements.header.quickAccessMenuElements;

import com.codeborne.selenide.SelenideElement;
import ua.com.stolkacha.pages.LoginPage;

public class QuickAccessMenuLinks {

    private SelenideElement quickAccessMenuLinks;

    public QuickAccessMenuLinks(SelenideElement quickAccessMenuLinks) {
        this.quickAccessMenuLinks = quickAccessMenuLinks;
    }

    public LoginPage clickOnSignInLink() {
        quickAccessMenuLinks.$(".links li:nth-child(5)").click();
        return new LoginPage();
    }
}
