package site.nomoreparties.stellaburgers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutTest {

    public WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Human being\\WebDriverbin\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

    }

    @Test
    public void successesfullLogIn(){
        LoginPage logPage = new LoginPage(driver);
        driver.get(logPage.URL);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.mailField));
        logPage.fillTheMailField("jiji@gmail.com");
        logPage.fillThePasswordField("Password");
        logPage.clickLogInButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.orderButton));
        String actual =logPage.findOrderButton();
        Assert.assertEquals("Оформить заказ",actual);
        PersonalAccount lkPage = new PersonalAccount(driver);
        lkPage.clickLKButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(lkPage.orderHistory));
        String enterLK =lkPage.checkEnteringLK();
        Assert.assertEquals("История заказов",enterLK);
        lkPage.clickLogOutButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(logPage.logInButton));
        String checkLogOut =logPage.findLogInButton();
        Assert.assertEquals("Войти",checkLogOut);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
