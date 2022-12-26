package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class BasketPage {
    WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div/div[6]/div")
    private WebElement deleteButton;

    public void deleteCake() throws InterruptedException {
        Thread.sleep(200);
        deleteButton.click();
    }
}
