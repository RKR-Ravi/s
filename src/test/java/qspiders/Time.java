package qspiders;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Time {
	public static void defaulttime() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeMedium css-1nvf7g0']")).click();
		driver.findElement(By.xpath("//li[@aria-label='12 hours']")).click();
		driver.close();
	}
	public static void analogtime() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/ui/timePick/timeClock?sublist=1']")).click();
		driver.findElement(By.xpath("//input[@placeholder='hh:mm aa']")).click();
		driver.findElement(By.xpath("//div[@class='MuiClock-squareMask css-1umqo6f']")).click();
		driver.findElement(By.xpath("//button[@title='open next view']")).click();
		driver.findElement(By.xpath("//div[@class='MuiClock-squareMask css-1umqo6f']")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		Time.defaulttime();
		Time.analogtime();
	}

}
