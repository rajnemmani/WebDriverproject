package mar22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.myntra.com/'");
		String pagetitile = js.executeScript("return document.title").toString();
		System.out.println(pagetitile);
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("Men"));
		Thread.sleep(3000);
		//Scroll to Men link and Click it
		js.executeScript("document.scrollInToView", element);
		element.click();
		Thread.sleep(3000);
		String pagetitile1 = js.executeScript("return document.title").toString();
		System.out.println(pagetitile1);
		driver.quit(); 
		

	}

}
