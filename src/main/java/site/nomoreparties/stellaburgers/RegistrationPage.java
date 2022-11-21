package site.nomoreparties.stellaburgers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    public static final String URL = "https://stellarburgers.nomoreparties.site/register";

    public static WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public static final By nameField = new By.ByXPath(".//div[1][@class='input pr-6 pl-6 input_type_text input_size_default']/input");
    private static final By mailField = new By.ByXPath(".//div[1][@class='input pr-6 pl-6 input_type_text input_size_default']/input");
    private static final By passwordField = new By.ByXPath(".//div[1][@class='input pr-6 pl-6 input_type_password input_size_default']/input");
    private static final By buttonSignIn = new By.ByXPath(".//button[text() = 'Зарегистрироваться']");
    private static final By passwordIsTooShort = new By.ByXPath(".//p[text()='Некорректный пароль']");
    private static final By logInLink = new By.ByXPath(".//a[text() = 'Войти']");

    public static void fillTheNameField(String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public static void fillTheMailField(String mail){
        driver.findElement(mailField).sendKeys(mail);
    }
    public static void fillThePasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public static void clickSignInButton(){
        driver.findElement(buttonSignIn).click();
    }

    public static void clickLogInLink(){
        driver.findElement(logInLink).click();
    }
    public String getErrorText(){
        String errorText = driver.findElement(passwordIsTooShort).getText();
        return errorText;
    }

}
