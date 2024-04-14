package mar18;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		//Get Parent Window ID
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		//Click three links
		driver.findElement(By.xpath("(//a[contains(.,'Terms')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Privacy Policy')])[2]")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();
		//Get Collection of all window Ids
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		for (String each : allwins) {
			// If parent id is not equals to each 
			if(!parent.equals(each))
			{
				//Switch to each child window and get title and close
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(3000);
				driver.close();
			}
		}
		//switch to parent
		driver.switchTo().window(parent);
		Select element = new Select(driver.findElement(By.id("year")));
		List<WebElement> all_items = element.getOptions();
		System.out.println("no of items::"+all_items.size());
		for (WebElement each : all_items) {
			System.out.println(each.getText());
			
		}
		driver.quit();

	}

}
