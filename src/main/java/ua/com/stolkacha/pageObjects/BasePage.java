package ua.com.stolkacha.pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {


    public String getPageTitle(){
        return $("head > title").getAttribute("text");
    }

    public boolean isElementVisible(SelenideElement element){
        return element.is(Condition.visible)?true:false;
    }




}
