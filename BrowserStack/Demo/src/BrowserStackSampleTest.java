import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BrowserStackSampleTest {
        public static final String USERNAME = "venkatasubbaiah2";
        public static final String AUTOMATE_KEY = "c6RdA5sqPJ5WyXdK8XJQ";
        public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
        public static void main(String[] args) throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "80");

            caps.setCapability("name", "venkatasubbaiah2's First Test");

            WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
            driver.get("https://www.ref.o2.co.uk/shop/samsung/galaxy-note20-ultra-5g");
            WebElement element = driver.findElement(By.name("q"));

            element.sendKeys("BrowserStack");
            element.submit();

            System.out.println(driver.getTitle());
            driver.quit();
        }
    }

