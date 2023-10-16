package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class EventManager extends ActionManager {
    public static void scrollHastaElemento(WebDriver driver, WebElement element) {
        if (driver instanceof JavascriptExecutor) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        }
    }

    public static void verifyUrl (String url) {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        String urlActual = driver.getCurrentUrl();
        Assert.assertTrue(urlActual.contains(url), "No está en la misma página");
    }

    public static void waitForPageLoad(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Espera hasta que el estado de la página sea "complete".
        new WebDriverWait(driver, 30).until(
                webDriver -> js.executeScript("return document.readyState").equals("complete"));
    }

    public static boolean elementoExiste(WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
