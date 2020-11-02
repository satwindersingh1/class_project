import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
public class First {
    @Test
    void setup(){
         System.setProperty("webdriver.chrome.driver", "C://Users//Owner//Downloads//chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("http://the-internet.herokuapp.com/");
         String title= driver.getTitle();
         Assert.assertTrue(title.contains("The Internet"));
         driver.findElement(By.xpath("/html/body/div[2]/a/img")).isDisplayed();

    }}




