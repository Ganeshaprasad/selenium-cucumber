package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
  //public   WebDriver driver;

    public LoginPage(WebDriver driver) {
       // this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@class='password']")
    private WebElement pwd;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement logInButton;

    public void setPassword(String password) {
        pwd.clear();
        pwd.sendKeys(password);
    }

    public void setEmail(String emails) {

        email.clear();
        email.sendKeys(emails);
    }

    public void clickOnLogin() {
        logInButton.click();
    }
}
