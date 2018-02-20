package ua.com.stolkacha.pageObjects;

import com.codeborne.selenide.SelenideElement;
import ua.com.stolkacha.enums.Manufacturer;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static ua.com.stolkacha.utils.ajaxutil.AjaxUtil.ajaxShouldBeEnded;

public class LampsPage extends BasePage {
    public static void openPage() {
        open("https://stolkacha.com.ua/lamps");
    }

    public static void selectFilter(Manufacturer manufacturer) {
        String filterItemLocator = String.format("#group .list-group li:nth-child(%d)", manufacturer.getIndex());
        $(filterItemLocator).click();
        ajaxShouldBeEnded();
    }

    public static List<String> getAllProductTitles() {

        List<String> titleList = new ArrayList<>();
        int pageCount = $$(".pagination li").size() - 2;
        int i = 2;

        do {
            for (SelenideElement title : $$(".product_title")) {
                titleList.add(title.getText());
            }
            i++;
            $(".pagination li:nth-child(" + i + ") a").click();
            ajaxShouldBeEnded();

        } while (i <= pageCount + 1);
        //titleList.forEach(item -> System.out.println(item));
        return titleList;
    }
}
