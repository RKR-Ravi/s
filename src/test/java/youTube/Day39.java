package youTube;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day39 {
	
	@Test
	public void BrokenLinks() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement>links= driver.findElements(By.tagName("a"));
		System.out.println("Total number of links "+links.size());
		
		int noOfBrokenLinks=0;
		for(WebElement link:links) {
			String hrefattValue=link.getAttribute("href");
			
			if(hrefattValue==null || hrefattValue.isEmpty()) {
				
				System.out.println("Not Possible");
				continue;
			}
		try {	
			URL urlLink=new URL(hrefattValue);   //converted href value from String to URL format
			HttpURLConnection conn= (HttpURLConnection) urlLink.openConnection();   //open connection to server
			conn.connect();  //connect to the server and send the request to the server
			
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefattValue+" ====>Broken Link");
				noOfBrokenLinks++;
			}
			else {
				System.out.println(hrefattValue+" ====>Not a Broken Link");
			}
		}
		catch(Exception e) 
		{
		}
			
		}
		System.out.println("No of Broken Links "+noOfBrokenLinks);
	}

}
