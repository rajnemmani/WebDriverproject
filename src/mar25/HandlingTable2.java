package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//Store Table in to webElement
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//Get Collection of rows in webtable
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println(row);
		//Iterate all rows
		for(int i=1; i<rows.size();i++)
		{
			//get cell collection from each roe
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No."+i+"   "+"Column Size::"+cols.size());
		}
		driver.quit();

	}

}
