package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo2 {

	public static void main(String[] args) 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement buttonElement= driver.findElement(By.xpath("//button[@name='login']"));
		boolean actualButtonDisplay= buttonElement.isDisplayed();
		System.out.println("Login button is displayed : "+ actualButtonDisplay);
		boolean expectedbuttonDisplay= true;
		
		 if(actualButtonDisplay==expectedbuttonDisplay)
		 {
			 System.out.println("login button is displayed");
		 }
		 else
		 {
			 System.out.println("login button is not displayed");
		 }
		 
		    boolean actualButtonEnabled= buttonElement.isDisplayed();
			System.out.println("Login button is Enabled : "+ actualButtonEnabled);
			boolean expectedbuttonEnabled= true;
			
			 if(actualButtonEnabled==expectedbuttonEnabled)
			 {
				 System.out.println("login button is enabled");
			 }
			 else
			 {
				 System.out.println("login button is not enableded");
			 }
			 
			 String actualbuttonname= buttonElement.getText();
			 System.out.println("actualbutton name is : "+actualbuttonname);
			 String expectedButtonName="Log in";
			 if(actualbuttonname==expectedButtonName)
			 {
				 System.out.println("button name is displaying correctly");
			 }
			 else
			 {
				 System.out.println("button name is not displaying correctly");
				
			 }
			 
			 buttonElement.click();
			 
			 

	}

}
