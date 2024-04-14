package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//Store Table into webElement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows,cols;
		//Get rows collection from webtable
		rows = webtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		Thread.sleep(3000);
		//iterate all rows
		for (WebElement eachrow : rows) {
			//get each row cell collection
			cols = eachrow.findElements(By.tagName("td"));
			//iterate each cell
			for (WebElement eachcell : cols) {
				Thread.sleep(1000);
				System.out.println(eachcell.getText());
				
			}
			System.out.println("==========================================================");
			
			
			
		}
		Thread.sleep(5000);
		driver.quit();
		

	}

}
