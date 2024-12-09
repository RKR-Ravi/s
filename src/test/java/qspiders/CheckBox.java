package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {
	public static void defaultCheckBox() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.close();
	}
	public static void selected() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		driver.findElement(By.xpath("//input[@id='domain1']")).click();
		driver.findElement(By.xpath("(//input[@name='mode'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("//input[@id='submit']")).click();
	}
	public static void disbaled() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		driver.findElement(By.xpath("(//input[@value='true'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='mode12']")).click();
		driver.findElement(By.xpath("(//input[@name='mode'])[5]")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	public static void main(String[] args) {
		CheckBox.defaultCheckBox();
		CheckBox.selected();
		CheckBox.disbaled();
	}
}
