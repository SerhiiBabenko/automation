package ua.com.stolkacha.pageElements.header.quickAccessMenuElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ua.com.stolkacha.pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;

public class QuickAccessMenuLinks {

    private SelenideElement myAccount;
    private SelenideElement myWishList;
    private SelenideElement myCart;
    private SelenideElement setOrder;
    private SelenideElement signIn;

    public QuickAccessMenuLinks(SelenideElement quickAccessMenuLinks) {
        this.myAccount = quickAccessMenuLinks.$(".links li:nth-child(1)");
        this.myWishList = quickAccessMenuLinks.$(".links li:nth-child(2)");
        this.myCart = quickAccessMenuLinks.$(".links li:nth-child(3)");
        this.setOrder = quickAccessMenuLinks.$(".links li:nth-child(4)");
        this.signIn = quickAccessMenuLinks.$(".links li:nth-child(5)");
    }
//    @FindBy(how = How.CSS, using=".quick-access .links li:nth-child(1)")
//    private SelenideElement myAccount;
//
//    @FindBy(how = How.CSS, using=".quick-access .links li:nth-child(2)")
//    private SelenideElement myWishList;
//
//    @FindBy(how = How.CSS, using=".quick-access .links li:nth-child(3)")
//    private SelenideElement myCart;
//
//    @FindBy(how = How.CSS, using=".quick-access .links li:nth-child(4)")
//    private SelenideElement setOrder;
//
////    @FindBy(how = How.CSS, using=".quick-access .links li:nth-child(4)")
////    private SelenideElement signIn;
//@FindBy(css=".quick-access .links li:nth-child(5)")
//    private SelenideElement signIn;
//
//
//    public SelenideElement getMyAccount() {
//        return myAccount;
//    }
//
//    public SelenideElement getMyWishList() {
//        return myWishList;
//    }
//
//    public SelenideElement getMyCart() {
//        return myCart;
//    }
//
//    public SelenideElement getSetOrder() {
//        return setOrder;
//    }

    public LoginPage clickOnSignIn() {
        signIn.click();

        return new LoginPage();
    }
}
