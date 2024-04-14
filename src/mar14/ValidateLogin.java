package mar14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//Store username textbox into webelement to access morethan one web element method
		WebElement Objuser = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//Clear text
		Objuser.clear();
		//Send value in to textbox
		Objuser.sendKeys("Admin");
		//Capture User name
		String usernametext = Objuser.getAttribute("value");
		//Store password textbox into webelement to access morethan one web element method
		WebElement Objpass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		//Clear text
		Objpass.clear();
		//Send value in to textbox
		Objpass.sendKeys("Qedge123!@#");
		//Capture Password
		String passwordtext = Objpass.getAttribute("value");
		System.out.println(usernametext+"    "+passwordtext);
		//Click Login Button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			System.out.println("Username and Password are Valid::"+Expected+"   "+Actual);
		}
		else
		{
			//capture error message
			String error_message= driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+"   "+Expected+"   "+Actual);
		}
		Thread.sleep(5000);
		driver.quit();






	}

}
