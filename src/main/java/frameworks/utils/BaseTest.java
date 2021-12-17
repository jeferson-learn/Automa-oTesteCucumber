package frameworks.utils;

import frameworks.webDrivers.Browser;
import frameworks.webDrivers.DriverFactory;
import frameworks.webDrivers.DriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest extends DriverFactory {

    @BeforeAll
    public void setUp(){
        driver = getBrowser(Browser.CHORME);
        DriverManager.setDriver(driver);
        driver = DriverManager.getDriver();
//        driver.get("https://www.qazando.com.br/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown() {
        DriverManager.quit();
    }
}
