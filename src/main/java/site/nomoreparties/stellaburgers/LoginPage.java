package site.nomoreparties.stellaburgers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public static final String URL = "https://stellarburgers.nomoreparties.site/login";

    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    static final By mailField = new By.ByXPath(".//div[1][@class='input__container']/div/input[@type='text']");
    private static final By passwordField = new By.ByXPath(".//div[1][@class='input__container']/div/input[@type='password']");
    //[@class='text input__textfield text_type_main-default', type='password'
    static final By logInButton = new By.ByXPath(".//button[text() = 'Войти']");
    static final By orderButton = new By.ByXPath(".//button[text() = 'Оформить заказ']");

    public static void fillTheMailField(String mail){
        driver.findElement(mailField).sendKeys(mail);
    }
    public static void fillThePasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public static void clickLogInButton(){
        driver.findElement(logInButton).click();
    }
    public String findOrderButton(){
        String successText = driver.findElement(orderButton).getText();
        return successText;
    }
    public String findLogInButton(){
        String successText = driver.findElement(logInButton).getText();
        return successText;
    }
}
