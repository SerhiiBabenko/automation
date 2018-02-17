package ua.com.stolkacha.pages;

import com.codeborne.selenide.SelenideElement;
import ua.com.stolkacha.utils.registrationUtils.UserCredentials;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class CreateCustomerAccountPage extends BasePage {
    SelenideElement firstNameErrMsg = $("#advice-required-entry-firstname");
    SelenideElement lastNameErrMsg = $("#advice-required-entry-lastname");
    SelenideElement emailNameErrMsg = $("#advice-required-entry-email_address");
    SelenideElement passErrMsg = $("#advice-required-entry-password");
    SelenideElement confPassErrMsg = $("#advice-required-entry-confirmation");

    public void setRegstrCredentials(UserCredentials userCredentials) {
        $("#firstname").sendKeys(userCredentials.getFirstName());
        $("#lastname").sendKeys(userCredentials.getLastName());
        $("#email_address").sendKeys(userCredentials.getEmail());
        $("#password").sendKeys(userCredentials.getPass());
        $("#confirmation").sendKeys(userCredentials.getConfPass());
    }

    public Collection<String> getErrMessages() {

        List<String> errMsgs = new ArrayList<>();
        errMsgs.add(firstNameErrMsg.isDisplayed() ? firstNameErrMsg.getText() : "");
        errMsgs.add(lastNameErrMsg.isDisplayed() ? lastNameErrMsg.getText() : "");
        errMsgs.add(emailNameErrMsg.isDisplayed() ? emailNameErrMsg.getText() : "");
        errMsgs.add(passErrMsg.isDisplayed() ? passErrMsg.getText() : "");
        errMsgs.add(confPassErrMsg.isDisplayed() ? confPassErrMsg.getText() : "");

        return errMsgs;

    }

    public void pressRegisterButton() {
        $("#form-validate").submit();
    }

}
