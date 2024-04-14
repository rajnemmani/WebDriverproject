package mar21;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
		// Right Click on Gmail link and Open in new window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//move mouse to gmail link
		ac.moveToElement(driver.findElement(By.linkText("Gmail")));
		ac.contextClick().perform();
		Thread.sleep(5000);
		//Create Object for Robot class
		Robot r = new Robot();
		//press down arrow for 2 times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//Switch to gmail window
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"))).click().perform();
		System.out.println(driver.getTitle());
		driver.close();
		//Switch to Parent window - google window
		driver.switchTo().window(brw.get(0));
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
