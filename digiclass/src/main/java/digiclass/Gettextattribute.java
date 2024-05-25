package digiclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextattribute {

	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\digiclass\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			   driver.get("https://letcode.in/");
			   driver.findElement(By.linkText("Log in")).click();
			   driver.findElement(By.name("email")).sendKeys("md.mohamedadil@gmail.com");
			   driver.findElement(By.name("password")).sendKeys("Mohamed@123");
			   driver.findElement(By.xpath("//button[.='LOGIN']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.linkText("Explore Workspace")).click();
			   driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			   Thread.sleep(2000);
			   //get text
			   WebElement Edit=driver.findElement(By.tagName("h1"));
			   String header=Edit.getText();
			   System.out.println(header);
			   
			  WebElement edger=driver.findElement(By.linkText("Sign out"));
			  String signuout1=edger.getText();
			  System.out.println(signuout1);
			  
			  String cardcontent=driver.findElement(By.className("card-content")).getText();
			  System.out.println(cardcontent);
			  //getattribute
		   	  String textbox=  driver.findElement(By.id("clearMe")).getAttribute("value");
			  System.out.println(textbox);
			  
			  String textbox2=  driver.findElement(By.id("getMe")).getAttribute("value");
			  System.out.println(textbox2);
			  
			  String textbox3 =driver.findElement(By.id("fullName")).getAttribute("placeholder");
			  System.out.println(textbox3);
			
			
			 
			   
			   
			   
			    
			    
			   
			   
		  
	
		
	}

}
