package ua.com.stolkacha.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.commons.lang3.StringUtils;
import ua.com.stolkacha.enums.Manufacturer;
import ua.com.stolkacha.pageObjects.LampsPage;

import org.junit.Assert;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LampsManufacStepsDefs {

    private Manufacturer manufacturer;

    @Given("^a user is on the Lamps page$")
    public void aUserIsOnTheLampPage() throws Throwable {
        LampsPage.openPage();
    }

    @When("user select (.*) filter item")
    public void userSelectManufacturerFilterItem(Manufacturer manufacturer) throws Throwable {
        this.manufacturer = manufacturer;
        LampsPage.selectFilter(manufacturer);
    }

    @Then("^all product titles correspond to the selected manufacturer$")
    public void allTitesCorrespondToTheSelectedFilterItem() throws Throwable {
        List<String> titles = LampsPage.getAllProductTitles();

        //titles.forEach(title -> assertTrue("Product title is not coresponding to "+manufacturer.name(),
        //      title.contains(manufacturer.name())));

        for (String title : titles) {

            assertTrue("Title does not correspond to selected filter; Title is: "+title
                    , StringUtils.containsIgnoreCase(title, manufacturer.name()));

        }

    }

}
