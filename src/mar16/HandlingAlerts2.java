package mar16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img)[5]")).click();
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(5000);
		String alerttext1 = driver.switchTo().alert().getText();
		System.out.println(alerttext1);
		Thread.sleep(5000);
		//Click Cancel button
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(5000);
		//Click Ok
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String alerttext2 = driver.switchTo().alert().getText();
		System.out.println(alerttext2);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img)[4]")).click();
		driver.quit();



	}

}
