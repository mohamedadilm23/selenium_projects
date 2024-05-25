package digiclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\digiclass\\\\driver\\\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		 
		    driver.get("https://letcode.in/alert");
		    driver.findElement(By.id("accept")).click();
		    Thread.sleep(3000);
		    Alert alertin = driver.switchTo().alert();
		    String name= alertin.getText();
		    System.out.println("Mohamed adil simple alert text"+name);
		    alertin.accept();
		    //dismiss alert
		    driver.get("https://letcode.in/alert");
		    driver.findElement(By.id("confirm")).click();
		    Thread.sleep(3000);
		    Alert alert = driver.switchTo().alert();
		    String name1= alert.getText();
		    System.out.println("Enteryourname !"+name1);
		    alertin.dismiss();
		    
		    //promptalert
		    driver.get("https://letcode.in/alert");
		    driver.findElement(By.id("prompt")).click();
		    Thread.sleep(3000);
		    driver.switchTo().alert();
		    alert.sendKeys("QA engineer mohamed adil");
		    System.out.println(alert.getText());
		    alert.accept();
		    String adil =driver.findElement(By.id("myName")).getText();
		    System.out.println("Enter the prompt code name"+adil);
		    
		    
		    
		   
		    driver.quit();
	}

}
