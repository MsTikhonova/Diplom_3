package site.nomoreparties.stellaburgers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

    public WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Human being\\WebDriverbin\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

    }

    @Test
    public void successesfullLogInViaRegPage(){
        driver.get(RegistrationPage.URL);
        RegistrationPage regPage = new RegistrationPage(driver);
        regPage.clickLogInLink();
        LoginPage logPage = new LoginPage(driver);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.mailField));
        logPage.fillTheMailField("jiji@gmail.com");
        logPage.fillThePasswordField("Password");
        logPage.clickLogInButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.orderButton));
        String actual =logPage.findOrderButton();
        Assert.assertEquals("Оформить заказ",actual);
    }

    @Test
    public void successesfullLogInViaLKPage(){
        driver.get(MainPage.URL);
        PersonalAccount lkPage = new PersonalAccount(driver);
        lkPage.clickLKButton();
        LoginPage logPage = new LoginPage(driver);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.mailField));
        logPage.fillTheMailField("jiji@gmail.com");
        logPage.fillThePasswordField("Password");
        logPage.clickLogInButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.orderButton));
        String actual =logPage.findOrderButton();
        Assert.assertEquals("Оформить заказ",actual);
    }

    @Test
    public void successesfullLogInViaMainPage(){
        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogInButton();
        LoginPage logPage = new LoginPage(driver);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.mailField));
        logPage.fillTheMailField("jiji@gmail.com");
        logPage.fillThePasswordField("Password");
        logPage.clickLogInButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.orderButton));
        String actual =logPage.findOrderButton();
        Assert.assertEquals("Оформить заказ",actual);
    }

    @Test
    public void successesfullLogInViaLostPasswordPage(){
        driver.get("https://stellarburgers.nomoreparties.site/forgot-password");
        RegistrationPage regPage = new RegistrationPage(driver);
        regPage.clickLogInLink();
        LoginPage logPage = new LoginPage(driver);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.mailField));
        logPage.fillTheMailField("jiji@gmail.com");
        logPage.fillThePasswordField("Password");
        logPage.clickLogInButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.orderButton));
        String actual =logPage.findOrderButton();
        Assert.assertEquals("Оформить заказ",actual);
    }
    @After
    public void teardown() {
        driver.quit();
    }
}
