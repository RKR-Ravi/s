package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void SlideBar() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Slider']")).click();
		WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
		Actions act=new Actions(driver);
		int xOffset = 50;
        act.clickAndHold(slider).moveByOffset(xOffset, 0).release().perform();
        Thread.sleep(2000);

    
        driver.quit();
    }
	public static void main(String[] args) throws InterruptedException {
		Slider.SlideBar();
	}
	

}
