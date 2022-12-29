package TestBookYE;

import PageBookYE.BookYEHomePageElements;
import PageBookYE.UserCabinet;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBookYEUserCabinet extends TestInit {

    @Test
    public void testUserCabinet() {
        BookYEHomePageElements bookYEHomePageElements = new BookYEHomePageElements(driver);

        UserCabinet userCabinet = bookYEHomePageElements.EnterUserCabinet();

        UserCabinet userCabinet1 = userCabinet.inputUserData("oga16@ukr.net","ZAQ123");

        Assert.assertTrue(userCabinet.userLogin().isDisplayed());
        Assert.assertTrue(userCabinet.userPassword().isDisplayed());
        Assert.assertTrue(userCabinet.userRemindPassword().isDisplayed());
        Assert.assertTrue(userCabinet.userLoginRememberCheck().isDisplayed());
        Assert.assertTrue(userCabinet.inputRegistration().isDisplayed());
        Assert.assertTrue(userCabinet.userInputBtn().isDisplayed());
        Assert.assertTrue(userCabinet.userClose().isDisplayed());

    }


}
