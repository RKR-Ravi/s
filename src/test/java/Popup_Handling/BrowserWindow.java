package Popup_Handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserWindow {
	public static void NewWindow() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		Set<String> handles= driver.getWindowHandles();
		Iterator it=handles.iterator();
		String parentid=(String) it.next();
		String childid=(String) it.next();
		
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ravi@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	public static void newtab() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='New Tab']")).click();
		driver.findElement(By.xpath("//button[@id='browserButton4']")).click();
		Set<String> handles= driver.getWindowHandles();
		Iterator it=handles.iterator();
		String parentid=(String) it.next();
		String childid=(String) it.next();
		
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ravi@gmai.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	public static void multiplewindow() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//li[@class='  flex items-center w-[100%] justify-between py-1 px-2 cursor-pointer poppins'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='browserButton3']")).click();
		Set<String> handles= driver.getWindowHandles();
		Iterator it=handles.iterator();
		String parentid=(String) it.next();
		String childid=(String) it.next();
		
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ravi@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
	}
	public static void multipletabs() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/ui/browser/multipleTabs?sublist=3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='basis-[60%]']")).click();
		Set<String> handles= driver.getWindowHandles();
		Iterator it=handles.iterator();
		String parentid=(String) it.next();
		String childid=(String) it.next();
		
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ravi@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		BrowserWindow.NewWindow();
		BrowserWindow.newtab();
		BrowserWindow.multiplewindow();
		BrowserWindow.multipletabs();
	}

}
