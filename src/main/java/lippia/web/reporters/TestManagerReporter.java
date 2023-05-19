package lippia.web.reporters;

import com.crowdar.driver.DriverManager;

import io.lippia.reporter.ltm.TestManagerAPIAdapter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestManagerReporter extends TestManagerAPIAdapter {
    public TestManagerReporter(String arg0) {
    }

    @Override
    public String getBase64Image() {
        return  ((TakesScreenshot) DriverManager.getDriverInstance()).getScreenshotAs(OutputType.BASE64);
    }
}