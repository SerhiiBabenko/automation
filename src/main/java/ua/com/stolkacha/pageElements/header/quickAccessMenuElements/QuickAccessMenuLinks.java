package ua.com.stolkacha.pageElements.header.quickAccessMenuElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ua.com.stolkacha.pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;

public class QuickAccessMenuLinks {
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
        SelenideElement element =  $(By.linkText("Войти"));
        element.followLink();
        element = null;
//       element.click();

        return new LoginPage();
    }
}
