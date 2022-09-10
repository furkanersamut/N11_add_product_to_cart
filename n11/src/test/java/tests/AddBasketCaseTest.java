package tests;


import pages.*;
import users.AccountInformation;
import users.SearchInformation;
import users.SearchingPool;
import users.UserPool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class AddBasketCaseTest extends InitialTest {

    WebDriverWait wait;
    WebDriver driver;

@Test
public void Enter_correct_username_and_correct_password_add_basket_item() {

        logger.info("Case 1 : When Enter Correct Username and Correct Password add item to basket");

        homePage.AccountSıgnIn();
        homePage.UrlControl();

        LoginPage loginPage = homePage.loginPage();
        loginPage.refresh();
        AccountInformation accountInformation = UserPool.getUserFirst();
        loginPage.Username(accountInformation.getEmail());
        loginPage.Password(accountInformation.getPassword());
        loginPage.ClickLoginButton();
        CheckAccount checkAccount = loginPage.checkAccount();
        checkAccount.GotoAccount();
        checkAccount.accountNameControl();
        homePage.ClickSearchBox();
        SearchInformation searchInformation = SearchingPool.getSearchFirst();
        homePage.whatUWannaSearch(searchInformation.getSearchSomething());
        homePage.ClickSearchButton();
        homePage.ClickPageTwo();
        homePage.ChoicePhone();
        homePage.AddToBasket();
        homePage.GoToBasket();
        homePage.BasketIsNotEmptyControl();
        homePage.ClearBasket();
        homePage.DeleteButton();
        homePage.BasketIsEmptyControl();

        }
}