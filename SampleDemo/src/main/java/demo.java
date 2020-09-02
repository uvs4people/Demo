import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\subbaiv1\\IdeaProjects\\regression\\Browsers\\ChromeDriver\\chromedriver.exe");
        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "iPhone X");
        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        WebDriver driver = new ChromeDriver(capabilities);

        driver.manage().window().maximize();
        driver.get("https://www.ref.o2.co.uk/shop");

    }
}