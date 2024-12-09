package qspiders;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimePicker {
	public static void defaultTimepicker() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("(//section[text()='Time Picker'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='hh:mm aa']")).click();
		 WebElement timePickerInput = driver.findElement(By.id("//input[@id=':re:']"));
	        timePickerInput.click();
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//input[@id=':re:']")));
	        String hourToSelect = "3";
	        String minuteToSelect = "30";
	        String periodToSelect = "PM";
	        WebElement hourElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'" + hourToSelect + "')]")));
	        hourElement.click();

	        
	        WebElement minuteElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'" + minuteToSelect + "')]")));
	        minuteElement.click();

	        
	        WebElement periodElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'" + periodToSelect + "')]")));
	        periodElement.click();

	       
	        WebElement doneButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("doneButtonId")));
	        doneButton.click();

	        
	        String selectedTime = timePickerInput.getAttribute("value");
	        if (selectedTime.equals("03:30 PM")) {
	            System.out.println("Time selected successfully!");
	        } else {
	            System.out.println("Time selection failed!");
	        }

	       
	        driver.quit();
	    }

}
