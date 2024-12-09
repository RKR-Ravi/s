package qspiders;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	public static void notificationpopup() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Notification']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		Notification.notificationpopup();
	}

}
