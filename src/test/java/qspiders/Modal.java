package qspiders;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Modal {
	public static void defaultmodal() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Modal']")).click();
		driver.findElement(By.xpath("//button[@id='modal1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='modal-close']")).click();
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		//driver.findElement(By.xpath("//button[@id='closeModal']")).click();	
	}
	public static void MultipleModal() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Modal']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@aria-current='page'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='multiClosemodal']")).click();
		driver.findElement(By.xpath("(//button[text()='close'])[1]")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		Modal.MultipleModal();
		Modal.defaultmodal();
	}
	

}
