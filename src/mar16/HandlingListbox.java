package mar16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//Verify listbox is a Single selection or multi selection
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		//Select0 to 8 items from the listbox
		for(int i=0; i<=8; i++)
		{
			Thread.sleep(3000);
			//Select one by one item
			dropdown.selectByIndex(i);
					
		}
		//deselect from selection
		dropdown.deselectByVisibleText("Yellow");
		Thread.sleep(3000);
		dropdown.deselectByIndex(0);
		Thread.sleep(3000);
		dropdown.deselectAll();
		Thread.sleep(3000);
		driver.quit(); 
		
		

	}

}
