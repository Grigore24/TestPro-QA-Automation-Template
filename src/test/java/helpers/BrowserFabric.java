package helpers;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFabric {
    public static WebDriver getWebdriver(BrowserType browserType){
        switch (browserType){
            case SAFARI: return getSafariDriver();
            case FIREFOX: return getFirefoxDriver();
            default: return getChromeDriver();
        }
    }

    private static WebDriver getSafariDriver() {
        WebDriverManager.safaridriver().setup();
        return new SafariDriver();
    }

    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        options.addArguments("--headless");
        return new FirefoxDriver();
    }

    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
