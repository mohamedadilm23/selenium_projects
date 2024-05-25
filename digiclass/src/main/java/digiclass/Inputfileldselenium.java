package digiclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputfileldselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\digiclass\\\\driver\\\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		 
		   driver.get("https://letcode.in/");
		   driver.findElement(By.id("testing")).click();
		   driver.findElement(By.xpath("//a[text()='Edit']")).click();
		   driver.findElement(By.id("fullName")).sendKeys("mohamed adil");
		   driver.findElement(By.id("join")).sendKeys("Software QA Engnieer",Keys.TAB);
		   String myvalue=driver.findElement(By.id("getMe")).getAttribute("value");
		   System.out.println(myvalue);
		   driver.findElement(By.id("clearMe")).clear();
		   boolean Edit=driver.findElement(By.id("noEdit")).isEnabled();
		   System.out.println(Edit);
		   String myreadonlyvalue=driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		   System.out.println(myreadonlyvalue);
		   driver.quit();
		   
	}

}
