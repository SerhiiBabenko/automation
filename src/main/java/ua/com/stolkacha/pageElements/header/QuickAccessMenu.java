package ua.com.stolkacha.pageElements.header;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ua.com.stolkacha.pageElements.header.quickAccessMenuElements.QuickAccessMenuLinks;
import ua.com.stolkacha.pageElements.header.quickAccessMenuElements.SearchMiniForm;

public class QuickAccessMenu {
    @FindBy(how= How.CLASS_NAME, using="quick-access")
    private QuickAccessMenuLinks quickAccessMenuLinks;

    @FindBy(how= How.ID, using="search_mini_form")
    private SearchMiniForm searchMiniForm;

    public QuickAccessMenu() {
        this.quickAccessMenuLinks = new QuickAccessMenuLinks();
        this.searchMiniForm = new SearchMiniForm();
    }

    public QuickAccessMenuLinks getQuickAccessMenuLinks() {
        return quickAccessMenuLinks;
    }

    public SearchMiniForm getSearchMiniForm() {
        return searchMiniForm;
    }
}
