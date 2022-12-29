package PageBookYE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BookSearchPage extends BasePage{

    public BookSearchPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> SearchElementsBook(){
        return driver.findElements(By.xpath("//*[contains(text(), 'Мистецтво війни')]"));
    }
}
