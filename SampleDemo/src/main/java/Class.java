import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Class {
    public static void main(String[] args) {
        Map<String, String> mobileEmulation = new HashMap();
        mobileEmulation.put("deviceName", "Nexus 5");

       // mobileEmulation.put("deviceMetrics", mobileEmulation);



        System.setProperty("webdriver.chrome.driver","C:\\Users\\subbaiv1\\IdeaProjects\\regression\\Browsers\\ChromeDriver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.ref.o2.co.uk/shop");

    }
}
