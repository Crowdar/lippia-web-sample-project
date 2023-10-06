package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

public class ShopService {

    private static final String FILTER_BY_PRICE_LABEL = "//*[@id=\"n2-ss-6\"]/div[1]/div/div/div[1]/div[1]/img";

    public static void verifyPage() {
        Assert.assertTrue( ActionManager.waitPresence( FILTER_BY_PRICE_LABEL ).isDisplayed() );
    }
}
