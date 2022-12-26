package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CakePage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/a")
    private WebElement baskedButton;

    public CakePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToBasket() throws InterruptedException {
        Thread.sleep(200);
        baskedButton.click();
    }
    public BasketPage openBasketPage() throws InterruptedException {
        Thread.sleep(200);
        baskedButton.click();
        return new BasketPage(driver);
    }
}
