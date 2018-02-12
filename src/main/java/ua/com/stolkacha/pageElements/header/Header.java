package ua.com.stolkacha.pageElements.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header {
    @FindBy(how= How.CSS, using="h2.logo")
    protected Logo mainLogo;
    @FindBy(how= How.CSS, using=".phones")
    protected Phones phones;
    @FindBy(how= How.CSS, using=".quick-access")
    protected QuickAccessMenu quickAccessMenu;


    public Header() {
        this.mainLogo = new Logo();
        this.phones = new Phones();
        this.quickAccessMenu = new QuickAccessMenu();
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
