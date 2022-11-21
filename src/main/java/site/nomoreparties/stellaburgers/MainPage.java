package site.nomoreparties.stellaburgers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    public static WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    static final By loginMainPageButton = new By.ByXPath(".//button[text() = 'Войти в аккаунт']");

    public static void clickLogInButton(){
        driver.findElement(loginMainPageButton).click();
    }
}
