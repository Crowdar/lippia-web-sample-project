package lippia.web.listeners.validator;

import org.openqa.selenium.WebDriver;

public interface DriverEventListenerValidation {

    void validate(Throwable throwable, WebDriver driver);
}
