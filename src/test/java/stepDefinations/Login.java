package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectRepository.LoginPage;

public class Login {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {

        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);

    }

    @When("User open the URL {string}")
    public void user_open_the_url(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(5000);
    }

    @When("User enter email as {string} and password as {string}")
    public void user_enter_email_as_and_password_as(String email, String pwd) {
       loginPage.setEmail(email);
    loginPage.setPassword(pwd);
        loginPage.clickOnLogin();
    }

    @When("Click on login button")
    public void click_on_login_button() {

    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String string) {

    }

    @When("user click on log out")
    public void user_click_on_log_out() {

    }

    @And("close the browser for Login Page")
    public void closeTheBrowser() {

    }

}
