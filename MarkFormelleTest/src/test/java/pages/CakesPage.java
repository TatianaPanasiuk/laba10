package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CakesPage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[3]/div[4]/a/div[1]/div/img")
    private WebElement cakeLocator;


    public CakesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CakePage cakeClick() throws InterruptedException {
        Thread.sleep(2000);
        cakeLocator.click();
        return new CakePage(driver);
    }
}
