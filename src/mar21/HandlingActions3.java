package mar21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions3 {

	public static void main(String[] args) throws Throwable {
		//Write a script to perform multiple actions
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//Move mouse to Kids tab
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='kids']")));
		ac.perform();
		Thread.sleep(3000);
		//Move mouse to soft toys link
		ac.moveToElement(driver.findElement(By.linkText("Soft Toys")));
		ac.pause(5000);
		ac.click().perform();
		//Move mouse to beauty
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='beauty']")));
		ac.perform();
		Thread.sleep(5000);
		//move to hair oil link and click
		ac.moveToElement(driver.findElement(By.linkText("Hair Oil")));
		ac.pause(5000);
		ac.click().perform();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
