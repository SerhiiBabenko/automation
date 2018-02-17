package ua.com.stolkacha;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;

public abstract class BaseTest {
    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/serhii/Desktop/AutomationProject/automation/src/main/resources/drivers/chromedriver");
        System.setProperty("selenide.browser", "Chrome");
        Configuration.timeout = 10000;
    }
}
