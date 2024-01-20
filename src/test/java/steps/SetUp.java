package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetUp {
    private static SetUp instance;
    private WebDriver driver;
    private WebDriverWait wait;

    private SetUp() {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofMillis(100));
    }

    public static SetUp getInstance() {
        if (instance == null) {
            instance = new SetUp();
        }
        return instance;
    }

    public static WebDriver getDriver() {
        return getInstance().driver;
    }

    public static WebDriverWait getWait() {
        return getInstance().wait;
    }

    public static void closeDriver() {
        if (instance != null && instance.driver != null) {
            instance.driver.quit();
            instance = null;
        }
    }
}