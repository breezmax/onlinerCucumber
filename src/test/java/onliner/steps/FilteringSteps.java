package onliner.steps;

import framework.BaseTest;
import framework.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import onliner.pageObject.pages.AutobaraholkaPage;
import onliner.pageObject.pages.MainPage;

public class FilteringSteps extends BaseTest {

    @Given("Go to {string}")
    public void goTo(String url) {
        driver.getInstance();
        driver.windowMaximize();
        driver.get(PropertyReader.getProperty("base.URL"));
    }

    @When("I navigate to the {string} page")
    public void iNavigateToThePage(String arg0) {
        MainPage mainPage = new MainPage();
        mainPage.navigateHeaderMenuCar("Автобарахолка");
    }

    @And("Set filtering price by {string}")
    public void setFilteringPriceBy(String arg0) {
        AutobaraholkaPage carPage = new AutobaraholkaPage();
        carPage.selectCurrency("USD");
    }

    @And("Set filtering cars by price {string}")
    public void setFilteringCarsByPrice(String arg0) {
        AutobaraholkaPage carPage = new AutobaraholkaPage();
        carPage.setFilterByPrice("до", "100000");
    }

    @And("Set filtering cars by Body Type {string}")
    public void setFilteringCarsByBodyType(String arg0) {
        AutobaraholkaPage carPage = new AutobaraholkaPage();
        carPage.setFilterByKuzov("Седан");
    }

    @And("Set filtering cars by Transmission{string}")
    public void setFilteringCarsByTransmission(String arg0) {
        AutobaraholkaPage carPage = new AutobaraholkaPage();
        carPage.setFilterByTransmission("Автоматическая");
    }

    @Then("Close the browser")
    public void closeTheBrowser() {
        driver.exit();
    }
}
