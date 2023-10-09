package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

public class HomeBanners {

    private static final String HOME_THREE_BANNER = "img[alt='Shop Selenium Books']";

    public static void verifyPage() {
        Assert.assertTrue( ActionManager.waitPresence( HOME_THREE_BANNER ).isDisplayed() );
    }
}
