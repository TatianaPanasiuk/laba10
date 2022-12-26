package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static final String HOMEPAGE_URL = "https://wolkonsky.com/";
    private final WebDriver driver;


    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div[1]/a[1]")
    private WebElement cityLocator;
    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[2]/div[2]/a")
    private WebElement acceptButtonLocator;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[1]/div/div[2]/div[2]/a")
    private WebElement menuLocator;



    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        driver.manage().window().maximize();
        return this;
    }

    public void cityClick() throws InterruptedException {
        Thread.sleep(10000);
        cityLocator.click();
    }

    public void acceptCity() throws InterruptedException {
        Thread.sleep(2000);
        acceptButtonLocator.click();
    }

    public CatalogPage menuClick() throws InterruptedException {
        Thread.sleep(20000);
        menuLocator.click();
        return new CatalogPage(driver);
    }
}
