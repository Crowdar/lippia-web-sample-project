package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginWebConstants;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginWebServices {
    public static void pageLogin(String userRole) {
        String webSiteUrl;
        switch (userRole) {
            case "SuperAdmin":
                webSiteUrl=PropertyManager.getProperty("web.base.url.superadmin");
                break;
            case "Admin":
                webSiteUrl=PropertyManager.getProperty("web.base.url.admin");
                break;
            default:
                webSiteUrl=PropertyManager.getProperty("web.base.url");
        }
        navigateTo(webSiteUrl);
    }

    public static void setEmail(String email) {
        setInput(LoginWebConstants.LOGIN_EMAIL, email);
    }

    public static void setPassword(String password) {
        setInput(LoginWebConstants.LOGIN_PASSWORD, password);
    }

    public static void clickOnEnterButton() {
        click(LoginWebConstants.LOGIN_BUTTON);
    }

    public static void validateView(String view) {
        String viewToValidate;
        if (view.toLowerCase().equals("alumno")) {
            viewToValidate = LoginWebConstants.VALIDATE_MY_INFORMATION;
        }else{
                viewToValidate=LoginWebConstants.VALIDATE_DASHBOARD;
        }
        WebActionManager.waitVisibility(viewToValidate);
        ResultsService.verifyActionResult(viewToValidate);
    }

    public static void clickOnRememberCredentials() {
        click(LoginWebConstants.LOGIN_CHECKBOX);
    }
}
