package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;

    // Locators
    private final By inpUserName = By.id("user-name");
    private final By inpPassword = By.id("password");
    private final By btnLogin = By.xpath("//div/form/input");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void clickLoginButton() {
        driver.findElement(btnLogin).click();
    }
    public void inputUserName() {
        driver.findElement(inpUserName).sendKeys("standard_user");
    }
    public void inputPassword() {
        driver.findElement(inpPassword).sendKeys("secret_sauce");
    }
}
