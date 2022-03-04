package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactory {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drv/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
