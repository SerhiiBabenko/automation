package ua.com.stolkacha.pageElements.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header {

    private Logo mainLogo;
    private Phones phones;
    private QuickAccessMenu quickAccessMenu;

    public Header(SelenideElement header) {
        this.mainLogo = new Logo(header.$("h2.logo"));
        this.phones = new Phones(header.$(".phones"));
        this.quickAccessMenu = new QuickAccessMenu(header.$(".quick-access"));
    }



    public Logo getMainLogo() {
        return mainLogo;
    }

    public Phones getPhones() {
        return phones;
    }

    public QuickAccessMenu getQuickAccessMenu() {
        return quickAccessMenu;
    }
}
