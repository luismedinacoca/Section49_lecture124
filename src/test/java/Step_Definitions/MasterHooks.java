package Step_Definitions;

import Utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory {
    @Before
    public void setup(){
        driver = getDriver();
    }

    @After
    public void tearDown(){
        if(driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;  /** very important  ========> DO NOT FORGET*/
        }
    }
}
