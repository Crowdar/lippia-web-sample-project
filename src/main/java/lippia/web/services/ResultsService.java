package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.NoSuchElementException;

public class ResultsService extends ActionManager {

    public static void assertErrorMessageDisplayed(String messageIdentifier) {
        Assert.assertTrue(getMessage(messageIdentifier).isEmpty());
    }

    public static void assertMessageDisplayed(String messageIdentifier) {
        Assert.assertFalse(getMessage(messageIdentifier).isEmpty());
    }

    public static String getMessage(String messageIdentifier) {
        WebElement element = verifyMessageElement(messageIdentifier);
        return element != null ? element.getText() : "";
    }

    private static WebElement verifyMessageElement(String messageIdentifier) {
        try {
            return getElement(messageIdentifier);
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    /*************** Verificar si ya esta en la home o se deslogueo ******************/
    public static void verifyActionResult(String constant) {
        Assert.assertFalse(getStats(constant).isEmpty());
    }
    public static String getStats(String constant) {
        return stats(constant).getText();
    }
    private static WebElement stats(String constant) {
        return getElement(constant);
    }
}
