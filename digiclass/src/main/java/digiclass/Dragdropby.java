package digiclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdropby {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\digiclass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/draggable/");
	   driver.switchTo().frame(0);
	   WebElement ele=driver.findElement(By.id("draggable"));
	   Actions Builder=new Actions(driver);
	   Thread.sleep(2000);
	   Builder.dragAndDropBy(ele, 30, 45).perform();
	}

}
