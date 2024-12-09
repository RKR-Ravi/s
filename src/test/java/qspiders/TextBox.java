package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextBox {
	public static void withPlaceholder() throws InterruptedException
	{	
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='With placeholder']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("ravikumar@gamil.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Ravikumar123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		
	}
	public static void withoutPlaceholder() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ravi kumar");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravi@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ravi1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	public static void withTooltip() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ravi kumar reddy");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravikumarreddy@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	public static void multipleTextArea() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//li[text()='Multiline Text Area']")).click();
		driver.findElement(By.xpath("//textarea[@type='text']")).sendKeys("Ravi kumar reddy");
		driver.findElement(By.xpath("//textarea[@type='email']")).sendKeys("ravikumar@gmail.com");
		driver.findElement(By.xpath("//textarea[@type='password']")).sendKeys("ravikumar1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	public static void disabled() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ravikumarreddy");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ravikumarr");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ravi123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		
		TextBox.withPlaceholder();
		TextBox.withoutPlaceholder();
		TextBox.withTooltip();
		TextBox.multipleTextArea();
		TextBox.disabled();
	}

}
