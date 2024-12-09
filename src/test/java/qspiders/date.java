package qspiders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class date {
	public static void dateselect() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='react-datepicker__month-container']")));
		String cmonth=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		Thread.sleep(3000);
		while(!(cmonth.equals("August 2024")))
		{
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			cmonth=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		}
		driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, August 11th, 2024']")).click();
	}
	public static void dropdowndate() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		driver.findElement(By.xpath("//a[text()='Dropdown DatePicker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		driver.findElement(By.xpath("//div[@class='react-datepicker__month-dropdown']")).click();
		driver.findElement(By.xpath("//div[text()='Aug']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, August 11th, 2024']")).click();
		Thread.sleep(3000);
		driver.close();
	}
	public static void IconTrigger() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		driver.findElement(By.xpath("//a[@href='/ui/datePick/iconstrigger?sublist=2']")).click();
		driver.findElement(By.xpath("//div[@stroke=\'currentColor\']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='react-datepicker__month-container']")));
		String cmonth=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		Thread.sleep(3000);
		while(!(cmonth.equals("August 2024")))
		{
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			cmonth=driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		}
		driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, August 11th, 2024']")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		date.dateselect();
		date.dropdowndate();
		date.IconTrigger();
	}
	

}
