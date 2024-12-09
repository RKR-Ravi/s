package qspiders;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Image {
	public static void defaultImage() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Image']")).click();
		WebElement image=driver.findElement(By.xpath("//img[@title='Image tooltip']"));
		org.openqa.selenium.Dimension size=image.getSize();
		int width=size.getWidth();
		int height=size.getHeight();
		System.out.println(width);
		System.out.println(height);
		driver.close();
	}
	public static void BrokenImages() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Image']")).click();
		driver.findElement(By.xpath("//a[text()='Broken Image']")).click();
		WebElement image=driver.findElement(By.xpath("(//img[@src='../a'])[1]"));
		org.openqa.selenium.Dimension size=image.getSize();
		int width=size.getWidth();
		int height=size.getHeight();
		System.out.println(width);
		System.out.println(height);
		driver.close();
	}
	public static void main(String[] args) {
		Image.defaultImage();
		Image.BrokenImages();
	}

}
