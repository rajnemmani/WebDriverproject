package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Counting_Items {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//Get Collection of items in list box
		List<WebElement> all_items = listbox.getOptions();
		System.out.println("No of Items are::"+all_items.size());
		Thread.sleep(5000);
		for (WebElement each : all_items) {
			Thread.sleep(100);
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
