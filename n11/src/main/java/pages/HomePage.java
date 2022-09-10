package pages;


import locators.Locator;
import xpaths.HomeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage extends Locator implements HomeConstants {

    private WebDriverWait wait;
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);

    }

    public void AccountSıgnIn() {
        sleep(1000);
        ClickByXpath(accountSıgnIn);
    }

    public void UrlControl() {

        sleep(1000);
        Assert.assertEquals("https://www.n11.com/giris-yap", driver.getCurrentUrl());

    }


    public LoginPage loginPage() {

        sleep(1000);
        Assert.assertEquals("Giriş Yap", GetTextByXpath(loginScreenControl));
        return new LoginPage(driver);


    }

    public void ClickSearchBox() {
        sleep(1000);
        ClickByXpath(searchBox);
    }



    public void whatUWannaSearch(String search) {
        sleep(1000);
        SendByXpath(searchBox, search);
    }

    public void ClickSearchButton() {
        sleep(1000);
        ClickByXpath(searchButton);
    }

    public void ClickPageTwo() {
        sleep(1000);
        ClickByXpath(pageTwo);
    }

    public void ChoicePhone() {
        sleep(1000);
        ClickByXpath(choicePhone);
    }

    public void SuccessMessageControl() {

        Assert.assertEquals("Ürün sepetinize eklendi", GetTextByXpath(successMessageForAddBasket));

    }

    public void GoToBasket() {
        sleep(1000);
        ClickByXpath(basket);
    }

    public void BasketIsNotEmptyControl() {

        Assert.assertEquals("Sepetim (1)", GetTextByXpath(basketNotEmpty));
    }

    public void AddToBasket() {
        sleep(1000);
        ClickByXpath(addBasket);
    }

    public void ClearBasket() {
        sleep(1000);
        ClickByXpath(clearBasketButton);
    }

    public void DeleteButton() {
        sleep(1000);
        ClickByXpath(deleteButton);
    }

    public void BasketIsEmptyControl() {

        Assert.assertEquals("Sepetin Boş Görünüyor", GetTextByXpath(emptyBasket));
    }
}