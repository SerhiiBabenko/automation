package ua.com.stolkacha.registration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ua.com.stolkacha.BaseTest;
import ua.com.stolkacha.pageObjects.CreateCustomerAccountPage;
import ua.com.stolkacha.pageObjects.HomePage;
import ua.com.stolkacha.pageObjects.LoginPage;
import ua.com.stolkacha.utils.registrationUtils.TestData;


import java.util.Collection;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.runners.Parameterized.Parameters;
import static ua.com.stolkacha.utils.ReadPropertiesUtil.getProperty;
import static ua.com.stolkacha.utils.registrationUtils.RegistrationDataUtil.getRegistrationData;

@Ignore
@RunWith(Parameterized.class)
public class RegistrationWithEmptyFielsTest extends BaseTest {

    TestData testData;

    public RegistrationWithEmptyFielsTest(TestData testData) {
        this.testData = testData;
    }

    @Parameters
    public static Collection<Object[]> testData() {
        return getRegistrationData(getProperty("regst_negativ_test_data_file"));
    }

    @Before
    public void initialize() {
        open("https://stolkacha.com.ua");
        LoginPage loginPage = new HomePage().selectSignInMenuLink();
        loginPage.pressCreateNewAccountButton();

    }


    @Test
    public void registrationWithEmtyFields() {

        CreateCustomerAccountPage createCustomerAccountPage = new CreateCustomerAccountPage();
        createCustomerAccountPage
                .setRegstrCredentials(testData.getUserCredentials());
        createCustomerAccountPage.pressRegisterButton();

        assertThat(createCustomerAccountPage.getPageTitle(), is("Создать новую учётную запись клиента"));
        Assert.assertThat(createCustomerAccountPage.getErrMessages(), equalTo(testData.getErrMsgs().asList()));

    }
}
