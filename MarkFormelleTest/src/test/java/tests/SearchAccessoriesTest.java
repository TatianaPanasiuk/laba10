package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class SearchAccessoriesTest {
    private WebDriver driver;
    MainPage mainPage;

    @BeforeMethod
    public void driverSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void Test() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.cityClick();
        mainPage.acceptCity();

        CatalogPage contactPage = mainPage.menuClick();

        CakesPage cakesPage = contactPage.cakesCatalogClick();

        CakePage cakePage = cakesPage.cakeClick();
        cakePage.addToBasket();

        BasketPage basketPage = cakePage.openBasketPage();
        basketPage.deleteCake();
    }

//    @AfterMethod(alwaysRun = true)
//    public void browserTearDown() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.quit();
//        driver = null;
//    }
}
