package site.nomoreparties.stellaburgers;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import site.nomoreparties.stellaburgers.RegistrationPage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    public WebDriver driver;

    @Before
    public void setUp(){
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Human being\\WebDriver\\bin\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Human being\\WebDriverbin\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

    }

    @Test
    public void successesfullSigning(){
        driver.get(RegistrationPage.URL);
        RegistrationPage regPage = new RegistrationPage(driver);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(regPage.nameField));
        regPage.fillTheNameField("Семён");
        regPage.fillTheMailField("jiji@gmail.com");
        regPage.fillThePasswordField("Password");
        regPage.clickSignInButton();
    }

    @Test
    public void errorSigning(){
        driver.get(RegistrationPage.URL);
        RegistrationPage regPage = new RegistrationPage(driver);
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(regPage.nameField));
        regPage.fillTheNameField("Семён");
        regPage.fillTheMailField("jiji@gmail.com");
        regPage.fillThePasswordField("1234");
        regPage.clickSignInButton();
        String actual =regPage.getErrorText();
        Assert.assertEquals("Некорректный пароль",actual);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
