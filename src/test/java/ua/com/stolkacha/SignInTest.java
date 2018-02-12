package ua.com.stolkacha;

import com.codeborne.selenide.Configuration;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.Verifier;
import ua.com.stolkacha.pages.CustomerAccountPage;
import ua.com.stolkacha.pages.HomePage;
import ua.com.stolkacha.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class SignInTest extends BaseTest {
    private LoginPage loginPage;

    @Before
    public void initialize(){
        open("https://stolkacha.com.ua");
        loginPage = new HomePage().selectSignInMenuLink();
    }

    @Test
    public void signInWithEmptyCredentials() {

        loginPage
                .setCredentials("", "")
                .pressLoginButton();

        assertThat(loginPage.getPageTitle(), is("Вход в систему"));
        assertThat(loginPage.getEmptyEmailErrMsg(), is("Это поле обязательно для заполнения."));
        assertThat(loginPage.getEmptyPassErrMsg(), is("Это поле обязательно для заполнения."));

        assertFalse(loginPage.isElementVisible(loginPage.getErrMsgElement()));


    }

    @Test
    public void signInWithValidCredentials() {

        loginPage
                .setCredentials("leprikon25@yandex.ru", "nokirpel252525")
                .pressLoginButton();

        assertThat(new CustomerAccountPage().getPageTitle(), is("Моя учётная запись"));

    }

    @Test
    public void signInWithPasswordOnly() {

        loginPage
                .setCredentials("", "nokirpel252525")
                .pressLoginButton();

        assertThat(loginPage.getPageTitle(), is("Вход в систему"));
        assertThat(loginPage.getEmptyEmailErrMsg(), is("Это поле обязательно для заполнения."));
        assertFalse(loginPage.isElementVisible(loginPage.getErrMsgElement()));
        assertFalse(loginPage.isElementVisible(loginPage.getErrMsgPassElement()));

    }


    @Test
    public void signInWithEmailOnly() {

        loginPage
                .setCredentials("leprikon25@yandex.ru", "")
                .pressLoginButton();

        assertThat(loginPage.getPageTitle(), is("Вход в систему"));
        assertThat(loginPage.getEmptyPassErrMsg(), is("Это поле обязательно для заполнения."));
        assertFalse(loginPage.isElementVisible(loginPage.getErrMsgElement()));
        assertFalse(loginPage.isElementVisible(loginPage.getErrMsgEmailElement()));

    }

























    @Test
    public void signInWithInvalidCredentials() {

        loginPage
                .setCredentials("leprikon@yandex.ru", "nokirpel")
                .pressLoginButton();

        assertThat(loginPage.getPageTitle(), is("Вход в систему"));
        assertTrue(loginPage.isElementVisible(loginPage.getErrMsgElement()));
        assertThat(loginPage.getErrMsgText(), is("Неверный адрес электронной почты (email) или пароль."));

    }

}
