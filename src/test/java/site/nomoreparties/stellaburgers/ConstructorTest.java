package site.nomoreparties.stellaburgers;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ConstructorTest {

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
        ConstructorPage tetrisPage = new ConstructorPage(driver);
        tetrisPage.clickConstructorButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(tetrisPage.bunsButton));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tetrisPage.clickSouceButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(tetrisPage.chosenSouceButton));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tetrisPage.clickFillingButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(tetrisPage.chosenFillingButton));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tetrisPage.clickBunsButton();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(tetrisPage.chosenBunsButton));

    }
    @After
    public void teardown() {
        driver.quit();
    }
}
