package mar26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {

	public static void main(String[] args) throws Throwable {
		//Date Picking from calender
		String dob = "December/20/1987";
		String temp[]= dob.split("/");
		String date= temp[1];
		String month= temp[0];
		String year= temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year))
		{
			//Click on Previous button
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		String calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calMonth.equalsIgnoreCase(month))
		{
			//Click Previousbutton
			driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//Pick the date
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					Thread.sleep(5000);
					//Click date
					eachcell.click();
				}
				
			}
		}
		
		

	}

}
