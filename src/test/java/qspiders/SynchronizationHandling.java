package qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SynchronizationHandling {
	public static void handlingWithTime() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		driver.findElement(By.xpath("//a[text()='With Timer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("10");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		driver.close();
	}
	public static void WithElement() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		driver.findElement(By.xpath("//a[text()='With Element']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("5");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-[33%] ease-linear transition-all duration-150']")).click();
		driver.findElement(By.xpath("//option[@value='yes']")).click();
		driver.close();
	}
	public static void withElementDisappear() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		driver.findElement(By.xpath("//a[text()='With Element Disappear']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("5");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-[33%] ease-linear transition-all duration-150']")).click();
		driver.findElement(By.xpath("//option[@value='yes']")).click();
		driver.close();	
	}
	public static void disabledElement() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("6");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		//driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-[33%] ease-linear transition-all duration-150']")).click();
		//driver.findElement(By.xpath("//option[@value='yes']")).click();
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		 SynchronizationHandling.handlingWithTime();
		 SynchronizationHandling.disabledElement();
		 SynchronizationHandling.WithElement();
		 SynchronizationHandling.withElementDisappear();
	}

}
