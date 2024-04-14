package mar16;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox2 {

	public static void main(String[] args) throws Throwable {
		// Select Items in the list box from 0 to 9
		// Get collection of items which are selected
		// Print each item name which are selected
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//Select 0 to 9 items
		for(int i=0; i<=9; i++)
		{
			Thread.sleep(1000);
			dropdown.selectByIndex(i);
		}
		//Get Collection of Items which are selected
		List<WebElement> all_Selected = dropdown.getAllSelectedOptions();
		System.out.println("No of items Selected::"+all_Selected.size());
		//Print each item name which are selected
		for (WebElement each : all_Selected) {
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
