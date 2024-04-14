package mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommans {

	public static void main(String[] args) throws Throwable {
		// CaptureGmail text and Url of the link
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String gmailtext= driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmailtext);
		//Print Gmail URL
		String url= driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(url);
		driver.quit();

	}

}
