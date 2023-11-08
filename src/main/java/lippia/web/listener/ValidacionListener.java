package lippia.web.listener;

import org.openqa.selenium.WebDriver;

public interface ValidacionListener {

    void validacion(Throwable throwable, WebDriver driver);
}
