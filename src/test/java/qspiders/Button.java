package qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Button {
	
	public static void defaultClick() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		driver.findElement(By.xpath("//button[@id='btn3']")).click();
		driver.findElement(By.xpath("//button[@id='btn6']")).click();
		
	}
	public static void rightClick() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		driver.findElement(By.xpath("//a[@href='/ui/button/buttonRight?sublist=1']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		driver.findElement(By.xpath("//button[text()='Right Click']")).click();
		driver.findElement(By.xpath("//button[@id='btn32']")).click();
		
	}
	public static void doubleClick() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		driver.findElement(By.xpath("//button[@id='btn20']")).click();
		driver.findElement(By.xpath("//button[@id='btn23']")).click();
		driver.findElement(By.xpath("//button[@id='btn26']")).click();
		
	}
	public static void submitClick() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		driver.findElement(By.xpath("//button[@id='btn40']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
		driver.findElement(By.xpath("//button[text()='submit']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[9]")).click();
		driver.findElement(By.xpath("//button[@id='btn42']")).click();
		driver.close();
	}
	public static void disabled() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='btn10']")).click();
		driver.findElement(By.xpath("//button[@id='btn10']")).click();
		driver.findElement(By.xpath("//button[@id='btn13']")).click();
		driver.findElement(By.xpath("//button[@id='btn17']")).click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		Button.defaultClick();
		Button.disabled();
		Button.doubleClick();
		Button.submitClick();
		Button.rightClick();
	}
}
