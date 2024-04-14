package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) throws Throwable {
		// Expected Title with Actual Title
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String Expected = "google";
		String Actual = driver.getTitle();
		if(Expected.equalsIgnoreCase(Actual))
		{
			System.out.println("title is Matching::"+Expected+"    "+Actual);
		}
		else
		{
			System.out.println("title is not Matching::"+Expected+"    "+Actual);
		}
		driver.quit();


	}

}
