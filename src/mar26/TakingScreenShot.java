package mar26;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wwww.facebook.com");
		Thread.sleep(5000);
		//take screenshot and store
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy Screenshot into local system
		FileUtils.copyFile(screen, new File("D:/Screenshot/homepage.png"));
		driver.quit();
	}

}
