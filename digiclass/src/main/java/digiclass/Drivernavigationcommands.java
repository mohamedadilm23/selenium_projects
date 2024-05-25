package digiclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivernavigationcommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\digiclass\\\\chromedriver\\\\chromedriver (1).exe");
		   WebDriver driver = new ChromeDriver();
		 
		   driver.get("https://letcode.in/buttons");
		    String url=driver.getCurrentUrl();
		    System.out.println("Buttons page url"+url);
		    Thread.sleep(3000);
		    
		    driver.findElement(By.id("home")).click();
		    String homeurl=driver.getCurrentUrl();
		    System.out.println("home page url"+homeurl);
		    Thread.sleep(3000);
		    
		    driver.navigate().back();
		    System.out.println("returns button page"+driver.getCurrentUrl());
		    Thread.sleep(3000);
		    driver.navigate().refresh();
		    driver.navigate().to("https://letcode.in/signin");
		    
		    
		    
		    
		
		
		
	}

}
