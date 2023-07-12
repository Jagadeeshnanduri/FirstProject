package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo2 
{
	@Test
	public void LabelText3text() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
		WebElement manageBookings=driver.findElement(By.xpath("//a[@title='Manage Bookings']"));
		manageBookings.click();
		Thread.sleep(4000);
		
		WebElement searchButton=driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();
		
		Thread.sleep(4000);
		String alertText=driver.switchTo().alert().getText();
		System.out.println("Alert text is : "+alertText);
		driver.switchTo().alert().dismiss();
		
		WebElement text=driver.findElement(By.xpath("//span[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
		text.getText();
		
		
		
	}



}
