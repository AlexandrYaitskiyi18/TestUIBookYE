package PageBookYE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserCabinet extends BasePage {

    public UserCabinet(WebDriver driver) {
        super(driver);
    }

    public WebElement userLogin() {
        return driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
    }

    public WebElement userPassword() {
        return driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
    }

    public WebElement userRemindPassword(){
        return driver.findElement(By.xpath("//a[contains(text(), 'Нагадати пароль')]"));
    }

    public WebElement userLoginRememberCheck(){
        return driver.findElement(By.xpath("//label[@class='auth-popup__remember']"));
    }

    public WebElement userInputBtn(){
        return driver.findElement(By.xpath("//input[@value='Увійти']"));
    }

    public WebElement inputRegistration() {
        return driver.findElement(By.xpath("//a[text()='Зареєструватись']"));
    }

    public WebElement userClose() {
        return driver.findElement(By.xpath("//div[@title='Закрити']"));
    }


    public UserCabinet inputUserData(String objectLogin, String objectPassword) {
        userLogin().sendKeys(objectLogin);
        userPassword().sendKeys(objectPassword);
        userLoginRememberCheck().click();
        userInputBtn().click();
        return new UserCabinet(driver);
    }
}
