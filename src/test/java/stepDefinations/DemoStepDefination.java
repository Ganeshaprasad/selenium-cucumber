package stepDefinations;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoStepDefination {
    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        driver = new ChromeDriver();
    }

    @When("I open home page")
    public void i_open_home_page() {
        driver.get("https://tutorialsninja.com/demo/");
    }
    @Then("I verify logo present on page")
    public void i_verify_logo_present_on_page() {
        boolean isLogoDisplayed = driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();
        Assert.assertEquals(true,isLogoDisplayed);
    }


    @And("close the browser")
    public void close_the_browser() {
        driver.close();
    }

}
