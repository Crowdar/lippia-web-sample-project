package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

public class HomeBanners {

    private static final String HOME_THREE_BANNER = "#n2-ss-6 > div.n2-ss-slider-1.n2-grab > div > div > div.n2-ss-slide.n2-ss-canvas.n2-ss-slide-active.n2-ss-slide-36 > div.n2-ss-slide-background > img";

    public static void verifyPage() {
        Assert.assertTrue( ActionManager.waitPresence( HOME_THREE_BANNER ).isDisplayed() );
    }
}
