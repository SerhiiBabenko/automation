package ua.com.stolkacha.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ua.com.stolkacha.pageElements.header.Header;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {
    @FindBy(how= How.CSS, using="div.header")
    private Header header;


    public HomePage() {
        this.header = new Header();
    }




    public LoginPage selectSignInMenuLink(){
       return header
                .getQuickAccessMenu()
                .getQuickAccessMenuLinks()
                .clickOnSignIn();


    }


}
