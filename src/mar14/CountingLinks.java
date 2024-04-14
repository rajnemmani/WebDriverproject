package mar14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) throws Throwable {
		// Count list of links
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rediff.com/");
		Thread.sleep(5000);
		//Get Collections of links in webpage which are stored in to HTML tag a
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are::"+all_links.size());
		//Print each link name
		for (WebElement each : all_links) {
			System.out.println(each.getText());
		}
		driver.quit();

	}

}
