package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class MarkFormelleTest extends CommonConditions {

//    @Test(description = "Открытие страницы контакты")
//    public void openContactsPage_TEST() throws InterruptedException{
//        new MainPage(driver)
//                .openPage()
//                .scrollToFooter()
//                .clickToContacts();
//    }

//    @Test(description = "Поиск, добавление и удаление из корзины товара")
//    public void Search_TEST() {
//        new MainPage(driver)
//                .openPage()
//                .getProductPage("Однотонная футболка с v-образным вырезом в оттенке \"турмалин\"")
//                .closeSpam()
//                .shirtClick()
//                .openListSize()
//                .choseSize()
//                .addToBasket()
//                .openBasketPage()
//                .scrollToDeleteButton()
//                .DeleteButtonClick();
//    }

//    @Test(description = "Сортировка товара по цене")
//    public void sortByPrice_TEST() {
//        new MainPage(driver)
//                .openPage()
//                .openCatalog()
//             //   .closeSpam()
//                .manProductsOpen() //---
//                .bestSellersPageOpen()
//                .sortListOpen()
//                .priceSortParamClick();
//    }

//    @Test(description = "Сортировка носков по рейтингу")
//    public void sortSocksByRate_TEST() {
//        new MainPage(driver)
//                .openPage()
//                .openCatalog()
//                //   .closeSpam()
//                .manProductsOpen() //---
//                .socksClick()
//                .socksPageOpen()
//                .sortListOpen()
//                .rateSortParamClick();
//    }

    @Test(description = "Сортировка носков по рейтингу")
    public void sortSocksByRate_TEST() {
        new MainPage(driver)
                .openPage()
                .openCatalog()
                //   .closeSpam()
                .manProductsOpen() //---
                .allProductsForMansOpen()
                .colorListOpen()
                .choseWhiteColor()
                .sizeListOpen()
                .choseSizeM()
                .clearFiltersClick();
    }
}
