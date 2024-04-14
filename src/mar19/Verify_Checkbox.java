package mar19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Checkbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		WebElement checkbox = driver.findElement(By.name("remember"));
		boolean value = checkbox.isSelected();
		System.out.println(value);
		if(value)
		{
			//if Value is True uncheck the Check box
			checkbox.click();			
		}
		else
		{
			//if Value is false check the Check box
			checkbox.click();
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
