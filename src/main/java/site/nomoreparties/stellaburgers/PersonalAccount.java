package site.nomoreparties.stellaburgers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccount {

    public static WebDriver driver;

    public PersonalAccount(WebDriver driver) {
        this.driver = driver;
    }
    static final By lkButton = new By.ByXPath(".//p[text()='Личный Кабинет']");

    static final By orderHistory = new By.ByXPath(".//a[text()='История заказов']");
    static final By logoutButton = new By.ByXPath(".//button[text() = 'Выход']");
    public static void clickLKButton(){
        driver.findElement(lkButton).click();
    }
    public static void clickLogOutButton(){
        driver.findElement(logoutButton).click();
    }

    public static String checkEnteringLK(){
        String successText = driver.findElement(orderHistory).getText();
        return successText;
    }

}
