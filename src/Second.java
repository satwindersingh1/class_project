import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class Second{
    @Test
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Owner//Downloads//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        List<WebElement> noofimages = driver.findElements(By.tagName("img"));
        System.out.println("No of images:" + noofimages.size());
        List<WebElement>nooflinks=driver.findElements(By.tagName("a"));
        System.out.println("No of Links:"+nooflinks.size());

    }
}