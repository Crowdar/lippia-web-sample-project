package lippia.web.listeners.validator;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.ActionManager.getElement;

final public class AdValidator implements DriverEventListenerValidation {

    private static String CLOSE_AD_BUTTON = "xpath://*[@id='dismiss-button']";
    public static final String AD_IFRAME1 = "xpath:/html/ins/*/*[contains(@id, 'aswift_') and not(contains(@id, 'host'))]";
    public static final String AD_IFRAME2 = "xpath://*[@id='ad_iframe']";

    @Override
    public void validate( Throwable throwable, WebDriver driver ) {
        if ( !AdVisible() )
            return;

        closeAd();
    }

    private boolean AdVisible() {
        return DriverManager.getDriverInstance().getCurrentUrl().contains( "#google_vignette" );
    }

    private static void closeAd() {
        WebDriver driver = DriverManager.getDriverInstance();
        closeIFrame( driver, getElement( AD_IFRAME1 ) );
        closeIFrame( driver, getElement( AD_IFRAME2 ) );
        driver.switchTo().defaultContent();
    }

    private static boolean closeIFrame( WebDriver driver, WebElement iframe ){
        if ( !iframe.isDisplayed() )
            return false;
        driver.switchTo().frame( iframe );
        try {
            getElement( CLOSE_AD_BUTTON ).click();
        }catch(Exception ignored ){
            return false;
        }
        return true;
    }


}
