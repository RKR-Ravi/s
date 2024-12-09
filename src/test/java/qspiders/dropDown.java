package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dropDown {
	public static void SingleSelect() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Single Select']")).click();
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9876543211");
		driver.findElement(By.xpath("//select[@id='select2']")).click();
		driver.findElement(By.xpath("//option[@value='male']")).click();
		driver.findElement(By.xpath("//select[@id='select3']")).click();
		driver.findElement(By.xpath("//option[@value='India']")).click();
		driver.findElement(By.xpath("//select[@id='select5']")).click();
		driver.findElement(By.xpath("//option[text()='Select State']")).click();
		driver.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[4]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}

}
