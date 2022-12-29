package TestBookYE;

import PageBookYE.BookSearchPage;
import PageBookYE.BookYEHomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBookYEHomePageElements extends TestInit{
    @Test
    public void testHomePageElements() {

        BookYEHomePageElements bookYEHomePageElements = new BookYEHomePageElements(driver);

        Assert.assertTrue(bookYEHomePageElements.headerMenuElement1().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerMenuElement2().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerMenuElement3().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerMenuElement4().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerMenuElement5().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerMenuElement6().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerMenuElement7().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerMenuElement8().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerMenuElement9().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerLogo().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerTel1().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.headerTel2().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.homeCatalog().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.homeKorzina().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.homePersWishList().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.inputLogin().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.footerSotsYoutube().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.footerSotsFacebook().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.footerSotsInstagram().isDisplayed());
        Assert.assertTrue(bookYEHomePageElements.footerSotsTelegram().isDisplayed());
    }

    @Test
    public void testHomeSearchBook() {
        BookYEHomePageElements bookYEHomePageElements = new BookYEHomePageElements(driver);
        BookSearchPage bookSearchPage = bookYEHomePageElements.search("мистецтво війни\n");

        Assert.assertTrue(bookSearchPage.SearchElementsBook().size() > 5);

    }

   }
