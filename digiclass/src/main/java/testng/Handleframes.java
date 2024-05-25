package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\digiclass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("mohmaed adil");
		driver.findElement(By.name("lname")).sendKeys("mohmaed");
		Thread.sleep(2000);
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("input[name='email']")).sendKeys("adil");
		driver.quit();

	}

}
