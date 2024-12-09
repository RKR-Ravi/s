package qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickAndHoldExample {
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://demoapps.qspiders.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        
		 Thread.sleep(3000);
        WebElement elementToClickAndHold = wait.until(ExpectedConditions.elementToBeClickable(By.id("//div[@id='circle']")));
        
       
        Actions actions = new Actions(driver);
        
        
        actions.clickAndHold(elementToClickAndHold).perform();
        
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        actions.release().perform();
       
        
        
       
        driver.quit();
    }
}
