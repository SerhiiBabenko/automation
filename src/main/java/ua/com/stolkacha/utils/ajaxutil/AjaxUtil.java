package ua.com.stolkacha.utils.ajaxutil;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.TimeoutException;

public class AjaxUtil {
    public static void ajaxShouldBeEnded(){
        boolean b = Selenide.executeJavaScript("return jQuery.active == 0");
        int timeCounter = 0;
        while (!b) {
            Selenide.sleep(1000);
            b = Selenide.executeJavaScript("return jQuery.active == 0");
            timeCounter++;
            if(timeCounter>10){
                throw new TimeoutException("Ajax is still processing after 10 seconds");
            }
        }
    }
}
