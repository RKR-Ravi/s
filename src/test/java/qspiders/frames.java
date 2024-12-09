package qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class frames {
	public static void defaultframes() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		driver.switchTo().frame("Sign up");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	public static void MultipleFrames() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("Sign Up");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Admin@gmail.com",Keys.TAB,"Admin@1234",Keys.TAB,"ADmin@1234",Keys.ENTER);
		driver.switchTo().frame("Login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin@gmail.com",Keys.TAB,"Admin@1234",Keys.ENTER);
		driver.switchTo().defaultContent();
		driver.close();
	}
	public static void NestedFrames() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
		driver.switchTo().frame("Login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@1234",Keys.TAB,"Admin@1234",Keys.ENTER);
		driver.switchTo().defaultContent();
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		frames.defaultframes();
		frames.NestedFrames();
		frames.MultipleFrames();
	}

}
