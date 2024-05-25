package digiclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshotelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\digiclass\\\\driver\\\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		 
		   driver.get("https://letcode.in/buttons");
		  File firstsrc= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  File dest=new File ("./screenshot/img1.png");
		  FileHandler.copy(firstsrc, dest);
		  
		  driver.get("https://letcode.in/test");
		  driver.findElement(By.linkText("Click")).click();
		  File button1= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  File  button2=new File ("./screenshot/img2.png");
		  FileHandler.copy(button1, button2);
		  driver.quit();
		
	}

}
