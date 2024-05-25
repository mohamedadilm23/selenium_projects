package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic3 {
@Test
	public  void dropdrop() {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\digiclass\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		WebElement radio=driver.findElement(By.xpath("//label[text()='Find if the checkbox is selected?']"));
		boolean radio1= radio.isSelected();
		System.out.println(radio1+"If check is enabled give this answer");
			
			
			
			driver.close();
			
				
		
		
		
	}

}
