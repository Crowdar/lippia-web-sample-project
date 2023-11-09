package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.CommonConstants;
import lippia.web.constants.BookstoreHomeConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static com.crowdar.driver.DriverManager.getDriverInstance;

public class BookstoreHomeService extends WebActionManager {

    public static void carouselImgValidation(int cantidad) {
        waitVisibility(BookstoreHomeConstants.CAROUSEL_IMG);
        List<WebElement> cantImg = getElements(BookstoreHomeConstants.CAROUSEL_IMG);
        List<WebElement> flecha = getElements(BookstoreHomeConstants.CAROUSEL_NEXT);
        int contador = 0;

        for (int i = 0; i < cantImg.size(); i++){
            flecha.get(0).click();
            contador++;
        }

        Assert.assertEquals(contador, cantidad);

    }

    public static void arrivalsValidation(int cantidad){
        waitVisibility(BookstoreHomeConstants.ARRIVAL_PRODUCTS);
        List<WebElement> list = getElements(BookstoreHomeConstants.ARRIVAL_PRODUCTS);
        Assert.assertEquals(list.size(), cantidad);
    }
    public static void cerrarPublicidad() {

        try{
            WebElement publi = getElement(CommonConstants.CLOSE_AD);
            if (publi.isDisplayed()) {
                publi.click();
                DriverManager.getDriverInstance().switchTo().defaultContent();
            }
        }catch(Exception efe) {
            System.out.println(efe.getMessage());
        }
    }

    public static void scrolluntil() {
        waitVisibility(BookstoreHomeConstants.NEW_ARRIVALS_TITLE);
        scroll(getElement(BookstoreHomeConstants.NEW_ARRIVALS_TITLE));
    }

    public static void scroll(WebElement element) {
        JavascriptExecutor jse = DriverManager.getDriverInstance();
        jse.executeScript("arguments[0].scrollIntoView()", new Object[]{element});
    }

    public static void clickeableImgValidation() {
        waitVisibility(BookstoreHomeConstants.ARRIVAL_PRODUCTS);
        List<WebElement> arrivals = getElements(BookstoreHomeConstants.ARRIVAL_PRODUCTS);
        arrivals.get(0).click();
    }


    public static void addButtonValidation() {
        waitVisibility(BookstoreHomeConstants.ADD_BUTTON);
        Assert.assertTrue(isVisible(BookstoreHomeConstants.ADD_BUTTON));
    }

    public static boolean isVisible(String locatorElement, String... locatorReplacementValue) {
        return getElement(locatorElement, locatorReplacementValue).isDisplayed();
    }
}

