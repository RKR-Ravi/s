package qspiders;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	public static void VerticalScroll() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='relative flex items-center justify-between  ps-5 pe-2 text-[15px] bg-gradient-to-r from-orange-400 to-orange-600 text-white rounded-e-sm py-1 mt-1 cursor-pointer']")).click();
		driver.findElement(By.xpath("(//a[@aria-current='page'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Thread.sleep(3000);
		driver.switchTo().window("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Actions act=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//input[@type='checkbox']"));
		act.scrollToElement(e1).click().perform();
		driver.findElement(By.xpath("//button[text()='Accept Our Policy']")).click();
		driver.quit();
	}
	public static void Horizontal() throws AWTException, InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[text()='Scroll'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[text()='Scroll'])[2]")).click();
		driver.findElement(By.xpath("(//a[@aria-current='page'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Thread.sleep(3000);
		driver.switchTo().window("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);	
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	public static void infinite() throws AWTException, InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[text()='Scroll'])[1]")).click();
		driver.findElement(By.xpath("(//section[text()='Scroll'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@aria-current='page'])[1]")).click();
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		Thread.sleep(3000);
		driver.switchTo().window("https://demoapps.qspiders.com/ui/scroll/newTabInfinite");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,6000);");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	public static void Withinframe() throws AWTException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("(//section[text()='Scroll'])[1]")).click();
		driver.findElement(By.xpath("(//section[text()='Scroll'])[2]")).click();
		driver.findElement(By.xpath("//section[text()='Within The Frame']")).click();
		driver.findElement(By.xpath("(//a[@aria-current='page'])[1]")).click();
		driver.switchTo().window("");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000);");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.switchTo().defaultContent();
		driver.close();
	}
	public static void withinframehori() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("(//section[text()='Scroll'])[1]")).click();
		driver.findElement(By.xpath("(//section[text()='Scroll'])[2]")).click();
		driver.findElement(By.xpath("//section[text()='Within The Frame']")).click();
		driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
		driver.switchTo().frame(2);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,6000);");
		driver.close();
	}
	public static void withinframeinfinte() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("(//section[text()='Scroll'])[1]")).click();
		driver.findElement(By.xpath("(//section[text()='Scroll'])[2]")).click();
		driver.findElement(By.xpath("//section[text()='Within The Frame']")).click();
		driver.findElement(By.xpath("(//a[@aria-current='page'])[1]")).click();
		driver.switchTo().frame(2);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,6000);");
		
	}
	public static void main(String[] args) throws Exception {
		Scroll.VerticalScroll();
		Scroll.Horizontal();
		Scroll.infinite();
		Scroll.Withinframe();
		Scroll.withinframehori();
		Scroll.withinframeinfinte();
	}

}
