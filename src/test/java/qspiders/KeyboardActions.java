package qspiders;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyboardActions {
	public static void Keyboard() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Keyboard']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravi@gmail.com",Keys.TAB,"123456",Keys.TAB,"123456",Keys.ENTER);
	}
	public static void VirtualKeys() throws Exception {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Virtual Keyboard']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("ravi@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();	
	}
	public static void main(String[] args) throws Exception {
		KeyboardActions.Keyboard();
		KeyboardActions.VirtualKeys();
	}

}
