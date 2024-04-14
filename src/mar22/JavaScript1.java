package mar22;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Create Object for interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Launch URL using JAVA Script
		js.executeScript("window.location='https://www.tatacliq.com/'");
		Thread.sleep(4000);
		//Print Title and Length of Title
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//Print URL and length of URL
		String strurl = js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		//Print Domain and and Length of Domain
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);
		System.out.println(domain.length());
		driver.quit();
		
		
				

	}

}
