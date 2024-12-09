package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TrainDetails {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("IRCTC");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='IRCTC']")).click();
		driver.findElement(By.xpath("//h3[text()='IRCTC Next Generation eTicketing System']")).click();
		Thread.sleep(2000);
	//	Alert alt=driver.switchTo().alert();
	//	alt.dismiss();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//a[@class='fa fa-window-close pull-right loginCloseBtn ng-tns-c19-13']")).click();
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Kacheguda");
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("nandyal");
		driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down']")).click();
		driver.findElement(By.xpath("//li[@aria-label='Sleeper (SL)']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement data=driver.findElement(By.xpath("//strong[text()=' KCG GNT EXP (17252)']"));
		
		FileInputStream fis=new FileInputStream("D:\\SELENIUM\\Sample.XLSX");
		Workbook b=WorkbookFactory.create(fis);
		Sheet sh=b.getSheet("Sample");
		Row r=sh.getRow(1);
		Cell c=r.createCell(4);
		c.setCellType(CellType.STRING);
		c.setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("D:\\\\SELENIUM\\\\Sample.XLSX");
		
		
	}

}
