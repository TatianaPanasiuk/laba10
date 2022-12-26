package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage {

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/ul/li[5]/a")
    private WebElement cakesLocator;

    WebDriver driver;


    public CatalogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CakesPage cakesCatalogClick() throws InterruptedException {
        Thread.sleep(200);
        cakesLocator.click();
        return new CakesPage(driver);
    }
}
