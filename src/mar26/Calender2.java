package mar26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender2 {

	public static void main(String[] args) throws Throwable {
		String dol = "2024-Jun-30";
		String temp[]=dol.split("-");
		String year= temp[0];
		String month=temp[1];
		String date= temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");
		Thread.sleep(5000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		//Click on Leave
		driver.findElement(By.xpath("//table[@class='quickLaungeContainer']/tbody/tr/td[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("calFromDate")).click();
		//Select Year from Calender
		new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"))).selectByVisibleText(year);
		Thread.sleep(5000);
		//Select month from Calender
		new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).selectByVisibleText(month);
		Thread.sleep(5000);
		//Select date from the Calender
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					Thread.sleep(5000);
					eachcell.click();
				}
			}
		}
		
		
	
		
		
		
		
		

	}

}
