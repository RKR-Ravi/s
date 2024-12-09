package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {
	public static void defaultRadioButton() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//a[text()='Default']")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[10]")).click();
		driver.findElement(By.xpath("//button[@id='btn']")).click();
	}
	public static void main(String[] args) {
		RadioButton.defaultRadioButton();
	}
	

}
