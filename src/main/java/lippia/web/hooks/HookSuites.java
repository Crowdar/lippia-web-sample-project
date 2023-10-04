package lippia.web.hooks;

import org.testng.annotations.BeforeSuite;

public class HookSuites {
    @BeforeSuite
    public void beforeAll(){
        System.out.println("Nestor");
    }
}
