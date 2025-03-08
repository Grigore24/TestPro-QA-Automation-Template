import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.HashMap;

public class BaseTest {
    private static WebDriver driver = null;
    public static WebDriverWait wait = null;
   // public static String url = "https://qa.koel.app/";
    private static final ThreadLocal<WebDriver> THREAD_LOCAL = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return THREAD_LOCAL.get();
    }

    //    @BeforeSuite
//    static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }
    @BeforeMethod
    @Parameters("baseUrl")
    public void setUpBrowser(String url) throws MalformedURLException {

        driver = pickBrowser(System.getProperty("browser"));
        THREAD_LOCAL.set(driver);
        THREAD_LOCAL.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(THREAD_LOCAL.get(), Duration.ofSeconds(7));
        // driver = BrowserFabric.getWebdriver(BrowserType.FIREFOX);
        //        WebDriverManager.firefoxdriver().setup();
        //        driver = new FirefoxDriver();
        // need to comment all BeforeSuite and BeforeMethod- only leave openurl work
        THREAD_LOCAL.get().get(url);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        getDriver().quit();
    }

    private WebDriver pickBrowser(String browser) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        String gridURL = "http://172.20.10.13:4444";
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return driver = new FirefoxDriver();
            case "safari":
                WebDriverManager.safaridriver().setup();
                return driver = new SafariDriver();
            case "edge":
                WebDriverManager.edgedriver().setup();
                return driver = new EdgeDriver();
            case "grid-firefox":
                capabilities.setCapability("browserName", "firefox");
                return driver = new RemoteWebDriver(URI.create(gridURL).toURL(), capabilities);
            case "grid-safari":
                capabilities.setCapability("browserName", "safari");
                return driver = new RemoteWebDriver(URI.create(gridURL).toURL(), capabilities);
            case "lambda":
                return getLambdaDriver();
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                options.addArguments("--disable-notifications");
                options.addArguments("--start-maximized");
                // options.addArguments("headless");
                return driver = new ChromeDriver(options);
        }
    }

    public WebDriver getLambdaDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        String hub = "@hub.lambdatest.com/wd/hub";
        String userName = "greytfly";
        String apiKey = "7wXbxSZgFhBvIA71RRHCu2VmyU978XYiklFp1wlbK1ucJIB75H";
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "133.0");
        HashMap<String, Object> ltOptions = new HashMap<>();
        ltOptions.put("username", userName);
        ltOptions.put("accessKey", apiKey);
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("project", "Koel");
        capabilities.setCapability("LT:Options", ltOptions);
        return driver = new RemoteWebDriver(URI.create("https://" + userName + ":" + apiKey + hub).toURL(), capabilities);
    }


    public void openUrl() {
        // String url = "https://qa.koel.app/";
        driver.get(url);
    }
}