package ua.com.stolkacha.pageElements.header;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ua.com.stolkacha.pageElements.header.quickAccessMenuElements.QuickAccessMenuLinks;
import ua.com.stolkacha.pageElements.header.quickAccessMenuElements.SearchMiniForm;

public class QuickAccessMenu {
//    @FindBy(how= How.CLASS_NAME, using="quick-access")
   private QuickAccessMenuLinks quickAccessMenuLinks;
//
//    @FindBy(how= How.ID, using="search_mini_form")
    private SearchMiniForm searchMiniForm;

    public QuickAccessMenu(SelenideElement quickAccessMenu) {
        this.quickAccessMenuLinks = new QuickAccessMenuLinks(quickAccessMenu.$(".links"));
        this.searchMiniForm = new SearchMiniForm(quickAccessMenu.$("#search_mini_form"));
    }

    public QuickAccessMenuLinks getQuickAccessMenuLinks() {
        return quickAccessMenuLinks;
    }

    public SearchMiniForm getSearchMiniForm() {
        return searchMiniForm;
    }
}
