package digiclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\digiclass\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://letcode.in/buttons");	
			//1.used visible elements checked visible or rendered
			/*
			 * WebElement login= driver.findElement(By.linkText("Log in")); boolean
			 * letxpathwebsite =login.isDisplayed();
			 * System.out.println("koushikjeewebsite:"+ letxpathwebsite);
			 */
		
			//2.is Enabled -is element etractable
			/*
			 * WebElement buttons=driver.findElement(By.id("isDisabled")); boolean
			 * buttons1=buttons.isEnabled();
			 * System.out.println("see if button is enabled:"+buttons1);
			 */
	driver.get("https://letcode.in/radio");
	WebElement radio=driver.findElement(By.xpath("//label[text()='Find if the checkbox is selected?']"));
	boolean radio1= radio.isSelected();
	System.out.println(radio1+"If check is enabled give this answer");
		
		
		
		driver.close();
		
		
	}

}
