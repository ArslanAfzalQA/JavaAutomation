package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverManager;
import org.testng.annotations.*;

public class Login_Test {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {
        driver = DriverManager.initializeDriver(browser);
        driver.get("https://www.saucedemo.com/");
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void login() {
        loginPage.inputUserName();
        loginPage.inputPassword();
        loginPage.clickLoginButton();

        Assert.assertEquals(homePage.getPageTitle(), "Swag Labs");

        homePage.clickAddToCartBackpackButton();
        Assert.assertTrue(homePage.isbackpackLabelPresent(), "Label not found on the page.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

