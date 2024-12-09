package Popup_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hiddenpopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[8]")).click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByClassName(\"w-1/2\")");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ravi");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravi@gmail.com");
		driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']")).click();
		driver.findElement(By.xpath("//option[text()='Mobile']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
