package base;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    public String baseUrl = "http://www.gittigidiyor.com";

    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedrivermac");


        ChromeOptions co = new ChromeOptions();
        co.addArguments("--start-maximized");
        co.addArguments("--start-fullscreen");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, co);

        driver = new ChromeDriver(capabilities);


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void tearDown() throws Exception {
        driver.quit();
    }

}
