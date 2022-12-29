package PageBookYE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookYEHomePageElements extends BasePage{


    public BookYEHomePageElements(WebDriver driver) {
        super(driver);
    }



    //елементи меню хедера
    public WebElement headerMenuElement1() {
        return driver.findElement(By.xpath("//a[text()='Новинки']"));
    }

    public WebElement headerMenuElement2() {
        return driver.findElement(By.xpath("//a[text()='Автори']"));
    }

    public WebElement headerMenuElement3() {
        return driver.findElement(By.xpath("//a[text()='Видавництва']"));
    }

    public WebElement headerMenuElement4() {
        return driver.findElement(By.xpath("//a[text()='ТОП книг']"));
    }

    public WebElement headerMenuElement5() {
        return driver.findElement(By.xpath("//a[text()='Передпродажі']"));
    }

    public WebElement headerMenuElement6() {
        return driver.findElement(By.xpath("//a[text()='Акції']"));
    }

    public WebElement headerMenuElement7() {
        return driver.findElement(By.xpath("//a[text()='Блог']"));
    }

    public WebElement headerMenuElement8() {
        return driver.findElement(By.xpath("//a[text()='Магазини і контакти']"));
    }

    public WebElement headerMenuElement9() {
        return driver.findElement(By.xpath("//a[text()='Доставка і оплата']"));
    }

    public WebElement headerLogo() {
        return driver.findElement(By.xpath("//a[@class='header__logo-link']"));
    }

    public WebElement headerTel1() {
        return driver.findElement(By.xpath("//a[text()='(0800) 33-05-66']"));
    }

    public WebElement headerTel2() {
        return driver.findElement(By.xpath("//a[text()='(044) 333-42-20']"));
    }

    public WebElement footerSotsYoutube() {
        return driver.findElement(By.xpath("//a[@title='Youtube']"));
    }

    public WebElement footerSotsFacebook() {
        return driver.findElement(By.xpath("//a[@title='Facebook']"));
    }

    public WebElement footerSotsTelegram() {
        return driver.findElement(By.xpath("//a[@title='Telegram']"));
    }

    public WebElement footerSotsInstagram() {
        return driver.findElement(By.xpath("//a[@title='Instagram']"));
    }

    public WebElement inputLogin() {
        return driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div[3]/a[3]"));
    }

    public WebElement inputSearch() {
        return driver.findElement(By.xpath("//*[@id='title-search-input']"));
    }

    public WebElement homeKorzina() {
        return driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div[3]/a[1]"));
    }

    public WebElement homePersWishList() {
        return driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div[3]/a[2]"));
    }

    public WebElement homeCatalog() {
        return driver.findElement(By.xpath("/html/body/header/div[3]/div/div/div/div[1]/a"));
    }

    public WebElement homeAllBooks() {
        return driver.findElement(By.xpath("//a[text()='Дивитись усі']"));
    }

    public WebElement trackerUser(){
        return  driver.findElement(By.xpath("//a[@data-toggle='modal']//span[@class='header-bottom__basket-quant']"));
    }

    public BookSearchPage search(String objectSearch) {
        inputSearch().sendKeys(objectSearch);
        return new BookSearchPage(driver);
    }



    public UserCabinet EnterUserCabinet() {
        inputLogin().click();
        return new UserCabinet(driver);
    }
}
