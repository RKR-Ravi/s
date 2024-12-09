package qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Toggle {
	public static void defaultToggle() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Toggle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		driver.close();
	}
	public static void disabled() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Toggle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		Toggle.defaultToggle();
		Toggle.disabled();
	}

}
