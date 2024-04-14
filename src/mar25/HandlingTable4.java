package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable4 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		//Store table in to WebElement
		WebElement webtable = driver.findElement(By.id("customers"));
		//Store rows, columns in to webelement list
		List<WebElement> rows, cols;
		//Get Row collection from webtable
		rows = webtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		Thread.sleep(3000);
		//iterate all rows in table
		for (WebElement eachrow : rows) {
			//get cell collection in each row
		cols = eachrow.findElements(By.tagName("td"));
		//iterate each cell
		for (WebElement eachcell : cols) {
			Thread.sleep(3000);
			System.out.println(eachcell.getText());
			
		}
			System.out.println("================================================");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
