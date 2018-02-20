package ua.com.stolkacha.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    public LoginPage setCredentials(String email, String pass) {

        $("#email").sendKeys(email);
        $("#pass").sendKeys(pass);

        return this;
    }

    public void pressLoginButton() {
        $("#send2").click();
    }
    public void pressCreateNewAccountButton() {
        $(".col-1.new-users .buttons-set .btn.btn-primary").click();
    }

    public String getErrMsgText() {
        return $(".messages .error-msg ul > li:nth-child(1) span").getText();
    }

    public String getEmptyEmailErrMsg() {
        return $("#advice-required-entry-email").getText();
    }

    public String getEmptyPassErrMsg() {
        return $("#advice-required-entry-pass").getText();
    }

    public SelenideElement getErrMsgElement() {
        return $(".messages .error-msg ul > li:nth-child(1) span");
    }

    public SelenideElement getErrMsgPassElement() {
        return $("#advice-required-entry-pass");
    }

    public SelenideElement getErrMsgEmailElement() {
        return $("#advice-required-entry-email");
    }


}
