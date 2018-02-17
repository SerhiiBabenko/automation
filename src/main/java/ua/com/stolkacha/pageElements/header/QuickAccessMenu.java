package ua.com.stolkacha.pageElements.header;

import com.codeborne.selenide.SelenideElement;
import ua.com.stolkacha.pageElements.header.quickAccessMenuElements.QuickAccessMenuLinks;
import ua.com.stolkacha.pageElements.header.quickAccessMenuElements.SearchMiniForm;

public class QuickAccessMenu {

    private SelenideElement quickAccessMenu;
    private QuickAccessMenuLinks quickAccessMenuLinks;
    private SearchMiniForm searchMiniForm;

    public QuickAccessMenu(SelenideElement quickAccessMenu) {
        this.quickAccessMenu = quickAccessMenu;
    }

    public QuickAccessMenuLinks getQuickAccessMenuLinks() {
        return new QuickAccessMenuLinks(quickAccessMenu.$(".links"));
    }

    public SearchMiniForm getSearchMiniForm() {

        return new SearchMiniForm(quickAccessMenu.$("#search_mini_form"));
    }
}
