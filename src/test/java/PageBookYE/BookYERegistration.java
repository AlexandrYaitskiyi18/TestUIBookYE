package PageBookYE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookYERegistration extends BasePage{

    public BookYERegistration(WebDriver driver) {
        super(driver);
    }

    public WebElement userLogin(){
        return driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
    }

    public WebElement userPassword(){
        return driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
    }

    public WebElement userInputBtn(){
        return driver.findElement(By.xpath("//input[@value='Увійти']"));
    }

    public WebElement inputRegistration() {
        return driver.findElement(By.xpath("//a[text()='Зареєструватись']"));
    }

    public WebElement inputRegisterName() {
        return driver.findElement(By.xpath("//input[@name='REGISTER[NAME]']"));
    }

    public WebElement inputRegisterEmail() {
        return driver.findElement(By.xpath("//input[@name='REGISTER[EMAIL]']"));
    }

    public WebElement inputRegisterPersonalPhone() {
        return driver.findElement(By.xpath("//input[@name='REGISTER[PERSONAL_PHONE]']"));
    }

    public WebElement inputRegisterPassword() {
        return driver.findElement(By.xpath("//input[@name='REGISTER[PASSWORD]']"));
    }

    public WebElement inputBtnRegistration() {
        return driver.findElement(By.xpath("//input[@value='Зареєструватись']"));
    }



}
