package qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void defaultmouseaction() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//div[text()='Drag Me']"));
		WebElement dest=driver.findElement(By.xpath("//div[@class='draggable-column bg-slate-100 flex justify-center items-center p-2 min-h-[400px] relative']"));
		act.dragAndDrop(element, dest);
	}
	public static void DragPosition() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Actions act=new Actions(driver);
		WebElement element=  driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement dest= driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		act.dragAndDrop(element, dest);
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement dest1=driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		act.dragAndDrop(e1, dest1);
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement dest2=driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100']0[2]"));
		act.dragAndDrop(e2, dest2);
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement dest3=driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100']0[2]"));
		act.dragAndDrop(e3, dest3);
		Thread.sleep(3000);
	}
	public static void dragMultiple() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement e1=   driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		act.contextClick();
		WebElement d1=driver.findElement(By.xpath("//div[@id='dropZone1']"));
		act.dragAndDrop(e1, d1);
		WebElement e2=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		act.contextClick();
		WebElement d2=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		act.dragAndDrop(e2, d2);
		WebElement e3=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		act.contextClick();
		WebElement d3=driver.findElement(By.xpath("//div[@id='dropZone2']"));
		act.dragAndDrop(e3, d3);
		WebElement e4=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		act.contextClick();
		WebElement d4=driver.findElement(By.xpath("//div[@id='dropZone2']"));
		act.dragAndDrop(e4, d4);
	}
	public static void main(String[] args) throws InterruptedException {
		MouseActions.defaultmouseaction();
		MouseActions.DragPosition();
		MouseActions.dragMultiple();
	}
	

}
