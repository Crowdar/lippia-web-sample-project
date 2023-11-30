package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AyudasServices extends ActionManager {
    public static void tiempo(int espera) {
        try {
            Thread.sleep(espera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void scroll(int desplazo){
        String script = String.format("window.scrollBy(0,%s)", desplazo);
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriverInstance();
        js.executeScript(script);
    }
    public static void emergentes(){
        String url = DriverManager.getDriverInstance().getCurrentUrl();
        navigateTo(url.replace("/#google_vignette",""));
    }
}
