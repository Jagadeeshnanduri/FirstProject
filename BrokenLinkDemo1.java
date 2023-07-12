package programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinkDemo1 
{
	
	@Test
	public void brokenlinktest() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/sai%20jagadeesh/Downloads/BrokenLink1.html");
		 WebElement linkElementBroken=driver.findElement(By.xpath("//a[text()='RBG technologies']"));
		 String brokenAttributeValue=linkElementBroken.getAttribute("href");
		 
		 URL url=new URL(brokenAttributeValue);
		 HttpURLConnection connect= (HttpURLConnection)url.openConnection();
		 connect.connect();
		 int responseCode=connect.getResponseCode();
		 System.out.println("response code : "+responseCode);
		 
		 
		 if(responseCode>=400)
		 {
			 System.out.println("It is a broken link");
		 }
		 else
		 {
			 System.out.println("It is a not broken link");
		 }
		 
		 
		 
		 

	}

}
