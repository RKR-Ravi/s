package qspiders;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoading {
	public static void defaultPageLoading() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Page Loading']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Thread.sleep(3000);
		driver.getWindowHandles();
		driver.switchTo().window("https://demoapps.qspiders.com/ui/pageLoad/newTab");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		PageLoading.defaultPageLoading();
	}

}
