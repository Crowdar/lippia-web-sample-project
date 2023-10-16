package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.ShopConstants;
import lippia.web.constants.SuperiorNavigationBarConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import static lippia.web.constants.HomeConstants.*;
import static lippia.web.constants.ShopConstants.*;

public class ShopService extends ActionManager {


    private static final String FILTER_BY_PRICE_LABEL = "xpath://*[@id='woocommerce_price_filter-2']/h4";


    public static void verifyPage() {
        Assert.assertTrue(ActionManager.waitPresence(HOME_PAGE_SLIDER).isDisplayed());
    }

    public static void clickMenuHome() {
        waitClickable(ShopConstants.HOME_MENU_BUTTON);
        click(ShopConstants.HOME_MENU_BUTTON);
    }

    public static void clickFirtItem() {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        WebElement element = driver.findElement(By.xpath("//*[@id='content']/ul"));
        EventManager.scrollHastaElemento(driver, element);
        waitClickable(FIRST_ITEM);
        click(FIRST_ITEM);
    }

    public static void clickDropdwon() {
        waitClickable(DROP_DOWN);
        click(DROP_DOWN);
    }

    public static void selectDropDownOption(String option) {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        // Localiza el elemento del dropdown por su selector CSS, XPath u otro
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id='content']/form/select"));

        // Crea un objeto Select para interactuar con el dropdown
        Select dropdown = new Select(dropdownElement);

        // Por índice (empezando en 0)
         // Esto seleccionará la tercera opción

        dropdown.selectByValue(option);

    }

}
