package utilies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprotectar extends Datautilies {

	@Test(dataProvider = "kowshikloginpage",dataProviderClass =Datautilies.class)
	public void login (String email,String pass)
	{
		System.err.println("Enter the email:"+email);
		System.err.println("Enter the password:"+pass);
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\digiclass\\\\driver\\\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://letcode.in/");
		   driver.findElement(By.linkText("Log in")).click();
		   driver.findElement(By.name("email")).sendKeys(email);
		   driver.findElement(By.name("password")).sendKeys(pass);
		   driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		   String title= driver.getTitle();
		   System.out.println("title is"+title);
		   driver.quit();
		   
		
	}

}
