package testng;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramtestng {
@Parameters({"emailid","password"})
@Test
	  void  param (String email,String word)

{
        System.out.println(email+""+word);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\digiclass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://digiclass-admin-staging1.gcp.digivalitsolutions.com");
		WebElement Activeelements =driver.switchTo().activeElement();
		Activeelements.sendKeys("digiproductsadmin@digi.com",Keys.TAB,"12345678",Keys.ENTER);;
	    driver.quit();

        }

	
		
		
	}


