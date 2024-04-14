package mar14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		System.out.println("Pagetitle[1]"+driver.getTitle());
		Thread.sleep(5000);
		//Click Gmail Link
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("Pagetitle[2]"+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("Pagetitle[3]"+driver.getTitle());
		Thread.sleep(5000);
		//Click forward button
		driver.navigate().forward();
		System.out.println("Pagetitle[4]"+driver.getTitle());
		Thread.sleep(5000);
		//Reload page
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
