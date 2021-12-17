package frameworks.webDrivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public WebDriver driver;

    public static WebDriver getBrowser(Browser tipos) {
        switch (tipos) {
            case CHORME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
        return null;
    }
}
