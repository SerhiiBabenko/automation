package ua.com.stolkacha.pageObjects;

import ua.com.stolkacha.pageElements.header.Header;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private Header header;

    public LoginPage selectSignInMenuLink() {
        header = new Header($("div.header"));
        return header
                .getQuickAccessMenu()
                .getQuickAccessMenuLinks()
                .clickOnSignInLink();


    }


}
