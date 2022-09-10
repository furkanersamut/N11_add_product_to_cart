package pages;

import locators.Locator;
import xpaths.CheckAccountConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;



public class CheckAccount extends Locator implements CheckAccountConstants  {

    private WebDriverWait wait;
    private WebDriver driver;


    public CheckAccount(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }


    public void GotoAccount(){
        ClickByXpath(goAccount);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals("https://www.n11.com/hesabim/siparislerim", driver.getCurrentUrl());

    }



    public void accountNameControl(){

        Assert.assertEquals("furkan ersamut", GetTextByXpath(accountName));
    }






}
