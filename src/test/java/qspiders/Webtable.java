package qspiders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable {
	public static void staticwebtable() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[4]")).click();
		String e1=driver.findElement(By.xpath("(//th[@scope='row'])[1]")).getText();
		System.out.println(e1);
		
		WebElement table = driver.findElement(By.xpath("//table[@class='w-full text-sm text-left text-gray-500 ']"));

		
		List<WebElement> allRows = table.findElements(By.xpath("//tr[@class='bg-white border-b  hover:bg-orange-100']"));
		
		for (WebElement row : allRows) {
		 List<WebElement> cells = row.findElements(By.tagName("td"));
		 for (WebElement cell : cells) {
		 System.out.println(cell);
		 }
		}
	}
	public static void dynamicwebtable() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[4]")).click();
		driver.findElement(By.xpath("//a[@href='/ui/table/dynamicTable']")).click();
		
		WebElement table = driver.findElement(By.xpath("//aside[@class='bg-white rounded-md h-[100%] w-[100%] border border-orange-200 shadow-sm shadow-orange-300 p-5 overflow-y-scroll myscrollbar ']"));		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
				for (WebElement row : allRows) {
				 List<WebElement> cells = row.findElements(By.tagName("td"));
				 for (WebElement cell : cells) {
				 System.out.println(cell);
				 }
				}
	}
	public static void Tablewithsort() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[4]")).click();
		driver.findElement(By.xpath("//a[@href='/ui/table/tableSort']")).click();
		WebElement table=driver.findElement(By.xpath("//div[@class='relative top-4 pb-5 pt-3']"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		for (WebElement row : allRows) {
		 List<WebElement> cells = row.findElements(By.tagName("td"));
		 for (WebElement cell : cells) {
		 System.out.println(cell);
		 }
		}
	}
	public static void Tablepage() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[4]")).click();
		driver.findElement(By.xpath("//a[@href='/ui/table/tablePagination']")).click();
		WebElement table = driver.findElement(By.xpath("//div[@class='relative top-4 pb-5 pt-3']"));		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
				for (WebElement row : allRows) {
				 List<WebElement> cells = row.findElements(By.tagName("td"));
				 for (WebElement cell : cells) {
				 System.out.println(cell);
				 }
				}
	}
	public static void Tablewithcheckbox() throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[4]")).click();
		driver.findElement(By.xpath("//a[@href='/ui/table/tableWithCheck']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		WebElement table = driver.findElement(By.xpath("//div[@class='relative top-4 pb-5 pt-3']"));		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
				for (WebElement row : allRows) {
				 List<WebElement> cells = row.findElements(By.tagName("td"));
				 for (WebElement cell : cells) {
				 System.out.println(cell);
				 }
				}
	}
	public static void main(String[] args) throws InterruptedException {
		Webtable.staticwebtable();
		Webtable.dynamicwebtable();
		Webtable.Tablewithsort();
		Webtable.Tablewithcheckbox();
	}

}
