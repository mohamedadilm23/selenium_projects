package digiclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activeelememnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\digiclass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ecs-dsweb-staging1.digivalitsolutions.com/login");
		WebElement Activeelements =driver.switchTo().activeElement();
		Activeelements.sendKeys("digiproductsadmin@digi.com",Keys.TAB,"Digival@600004",Keys.ENTER);
	}

}
