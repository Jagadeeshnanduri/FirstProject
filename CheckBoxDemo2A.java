package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2A {

	public static void main(String[] args) 
	{
		
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement checkBoxElement= driver.findElement(By.xpath("//*[@id='content']/div[4]/div/table/tbody/tr[6]/td/label/span"));
		WebElement for3Gselectelement=driver.findElement(By.xpath("//input[@id='caddoptional']"));
        boolean actualCheckboxElement=checkBoxElement.isDisplayed();
        System.out.println("actual checkbox element is displayed : "+actualCheckboxElement);
        boolean expectedCheckboxElement=true;
        
        if(expectedCheckboxElement==actualCheckboxElement)
        {
        	System.out.println("check box is displayed");
        }
        else
        {
        	System.out.println("check box is not displayed");
        }
        
        boolean actualCheckboxElementEnabled=checkBoxElement.isEnabled();
        System.out.println("actual checkbox element is Enabled : "+actualCheckboxElementEnabled);
        boolean expectedCheckboxElementEnabled=true;
        
        if(expectedCheckboxElementEnabled==actualCheckboxElementEnabled)
        {
        	System.out.println("check box is Enabled");
        }
        else
        {
        	System.out.println("check box is not Enabled");
        }
        
        
        boolean actualCheckboxElementSelected=for3Gselectelement.isSelected();
        System.out.println("actual checkbox element is selected : "+actualCheckboxElementSelected);
        boolean expectedCheckboxElementSeleced=true;
        
        if(expectedCheckboxElementSeleced==actualCheckboxElementSelected)
        {
        	System.out.println("check box is selected");
        }
        else
        {
        	System.out.println("check box is not selected");
        }
        
        checkBoxElement.click();
        
        boolean actualCheckboxSelected=for3Gselectelement.isSelected();
        System.out.println("actual checkbox is selected : "+actualCheckboxSelected);
        boolean expectedCheckboxSeleced=true;
        
        if(expectedCheckboxSeleced==actualCheckboxSelected)
        {
        	System.out.println("check box is selected");
        }
        else
        {
        	System.out.println("check box is not selected");
        }
        
        
        
	

	

	}

}
