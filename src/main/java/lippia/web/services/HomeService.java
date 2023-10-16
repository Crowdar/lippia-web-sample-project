package lippia.web.services;
import java.util.List;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static lippia.web.constants.HomeConstants.*;

public class HomeService extends ActionManager {

    public static void VerifierSlider(String numSlider) throws InterruptedException {
        int n = Integer.parseInt(numSlider);
        int CantSlider = 0;
        for (int i = 1; i <= n; i++) {
            String xpath = "//*[@id='n2-ss-6']/div[1]/div/div/div[" + i + "]/div[1]/img";
            WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
            WebElement element = driver.findElement(By.xpath(xpath));
            if (EventManager.elementoExiste(driver, By.xpath(xpath))) {
                CantSlider = CantSlider +1;
            }
            waitClickable(ARROW_SLIDER);
            click(ARROW_SLIDER);
        }
        Assert.assertEquals(n, CantSlider, "No hay tres imagenes distinas. La cantidad pedida es"+" "+ numSlider +" "+"Y la cantidad obtenida es"+" "+CantSlider);
    }

    public static void clickFirstArrival() throws InterruptedException {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        WebElement element = driver.findElement(By.xpath("//*[@id='themify_builder_content-22']/div[2]/div/div/div"));
        EventManager.scrollHastaElemento(driver, element);
        waitClickable(FIRST_ARRIVAL);
        click(FIRST_ARRIVAL);
    }





}
