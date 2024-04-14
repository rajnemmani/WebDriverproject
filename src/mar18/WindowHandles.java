package mar18;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		//Click three links
		driver.findElement(By.xpath("(//a[contains(.,'Terms')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Privacy Policy')])[2]")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();
		//Store all windows into array list
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(brw.get(2));
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("ngraj");
		driver.findElement(By.name("pass")).sendKeys("!@#edrrDDRR##@@");
		driver.findElement(By.xpath("//input[@value='Log in']")).sendKeys(Keys.ENTER);
		driver.quit();

	}

}
