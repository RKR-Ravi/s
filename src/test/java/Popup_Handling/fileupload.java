package Popup_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class fileupload {
	public static void defaultupload() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\'file\']")).sendKeys("Pictures\\night-sky-clouds-moon-wallpaper-preview.jpg");
		Thread.sleep(3000);
		driver.close();
	}
	public static void custombutton() throws InterruptedException
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		driver.findElement(By.xpath("//div[text()='Upload File']")).sendKeys("Pictures\\night-sky-clouds-moon-wallpaper-preview.jpg");
	}
	public static void draganddrop() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		driver.findElement(By.xpath("//div[@class='drop-container loading']")).click();
		WebElement src=driver.findElement(By.xpath("Pictures\\night-sky-clouds-moon-wallpaper-preview.jpg"));
		WebElement dest=driver.findElement(By.xpath("//div[@class='drop-container loading']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest);	
	}
	public static void multipleselect() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/ui/fileUpload/multiple?sublist=3']")).click();
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("Pictures\\night-sky-clouds-moon-wallpaper-preview.jpg"+"Pictures\\night-sky-clouds-moon-wallpaper-preview.jpg");
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		fileupload.defaultupload();
		fileupload.custombutton();
		fileupload.draganddrop();
		fileupload.multipleselect();
	}

}
