package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class LoginPageConstants {

    public static final String BUTTON_LOG_IN_MANUALLY = "xpath://*[@data-test-id='login-manual']";
    public static final String EMAIL_INPUT = "id:email";
    public static final String PASSWORD_INPUT = "xpath://input[@class='cl-form-control']";
    public static final String BUTTON_LOG_IN ="xpath://button[@data-test-id='login-button']";
    public static final String ALERT_MESSAGE ="xpath://*[@data-test-id='invalid-email']";
    public static final String ALERT_MESSAGE_PASSWORD ="xpath://div[contains(@class, 'cl-invalid-feedback')]";
    public static final String DROPDOWN ="xpath://*[@class='cl-p-0 cl-dropdown-toggle cl-no-arrow cl-d-flex']";
    public static final String BUTTON_LOG_OUT = "xpath://*[@id='topbar-menu']/div/div[2]/div/app-user-settings/div/div/div[1]/a";

}
