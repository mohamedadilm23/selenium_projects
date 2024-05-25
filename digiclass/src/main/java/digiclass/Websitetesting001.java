package digiclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Websitetesting001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Automatepractice\\driver\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://letcode.in/");
   driver.findElement(By.linkText("Log in")).click();
   driver.findElement(By.name("email")).sendKeys("md.mohamedadil@mail.com");
   driver.findElement(By.name("password")).sendKeys("12345678");
   driver.findElement(By.xpath("//button[.='LOGIN']")).click();
   
   
   
	}

}
