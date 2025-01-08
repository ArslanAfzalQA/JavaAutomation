package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Locators
    private final By lblBackpack = By.id("item_4_title_link");
    private final By btnAddToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void clickAddToCartBackpackButton() {
        driver.findElement(btnAddToCartBackpack).click();
    }

    public boolean isbackpackLabelPresent() {
        return driver.findElement(lblBackpack).isDisplayed();
    }
}
