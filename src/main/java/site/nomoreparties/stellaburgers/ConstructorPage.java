package site.nomoreparties.stellaburgers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConstructorPage {

    public static WebDriver driver;

    public ConstructorPage(WebDriver driver) {
        this.driver = driver;
    }
    static final By constructorButton = new By.ByXPath(".//p[text()='Конструктор']");

    static final By bunsButton = new By.ByXPath(".//div/span[text()='Булки']");
    static final By souceButton = new By.ByXPath(".//div/span[text() = 'Соусы']");
    static final By fillingButton = new By.ByXPath(".//div/span[text() = 'Начинки']");

    //проверка выбранности кнопки
    static final By chosenBunsButton = new By.ByXPath(".//div[@class = 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Булки']");
    static final By chosenSouceButton = new By.ByXPath(".//div[@class = 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text() = 'Соусы']");
    static final By chosenFillingButton = new By.ByXPath(".//div[@class = 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text() = 'Начинки']");

    public static void clickConstructorButton(){
        driver.findElement(constructorButton).click();
    }
    public static void clickBunsButton(){
        driver.findElement(bunsButton).click();
    }
    public static void clickSouceButton(){
        driver.findElement(souceButton).click();
    }
    public static void clickFillingButton(){
        driver.findElement(fillingButton).click();
    }

}
