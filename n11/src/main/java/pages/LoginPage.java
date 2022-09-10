package pages;

import locators.Locator;
import xpaths.LoginConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Locator implements LoginConstants  {


    private WebDriver driver;
    private WebDriverWait wait;


    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);

    }


    public void Username(String name) {
        sleep(1000);
        SendById(usernameTextBox,name);
    }


    public void Password(String password) {
        sleep(1000);
        SendById(passwordTextBox,password);
    }

    public void CloseAlert() {
        sleep(1000);
        ClickByXpath(closeAlert);
    }

    public void ClickLoginButton() {
        sleep(1000);
        ClickById(loginButton);
    }


    public CheckAccount checkAccount() {
        sleep(3000);
        return new CheckAccount(driver);
    }



public void refresh() {
    driver.navigate().refresh();
}


}
