package mar20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) throws Throwable {
		// Get Collection of Checkboxes
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/checkbox_1_lyst7599.html");
		Thread.sleep(5000);
		List<WebElement> all_checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("No of Checkboxes are::"+all_checkboxes.size());
		//Verify which Checkbox is True and False
		for (WebElement each : all_checkboxes) {
			boolean value = each.isSelected();
			//Get each Check box name Stored in to value property
			String checkboxname = each.getAttribute("value");
			System.out.println(checkboxname+"========"+value);
			Thread.sleep(3000);
			//Go to each and every checkbox
			each.click();
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
