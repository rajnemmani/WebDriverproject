package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Items {

	public static void main(String[] args) throws Throwable {
		// Verify required iteam is present or not in the list
		//declare one variable
		String Item_Present = "baby";
		boolean Iteam_Exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items = listbox.getOptions();
		System.out.println(all_items.size());
		for (WebElement each : all_items) {
			String Actual_items = each.getText();
			Thread.sleep(1000);
			System.out.println(Actual_items);
			if (Actual_items.equalsIgnoreCase(Item_Present)) {
				Iteam_Exist = true;
				break;
			}

		}
		if (Iteam_Exist) 
		{
			System.out.println(Item_Present+"     "+"Iteam Exist in List box");
		}
		else 
		{
			System.out.println(Item_Present+"   "+"Iteam does not Exist in List box");	
		}
		Thread.sleep(5000);
		driver.quit();


	}

}
