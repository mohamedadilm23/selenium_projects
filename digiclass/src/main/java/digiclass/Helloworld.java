package digiclass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\digiclass\\\\driver\\\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://ecs-dsweb-staging.digivalitsolutions.com/login"); 
        WebElement emailbox= driver.findElement(By.id("mui-1"));
        emailbox.sendKeys("digiproductsadmin@digi.com");
        
        WebElement passwordbox=driver.findElement(By.id("mui-2"));
        passwordbox.sendKeys("12345678");
        
        WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div/div[2]/div/div/form/div[3]/button"));
        loginbutton.click();
        Thread.sleep(2000);
        
        WebElement Dashboard=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[1]/div/div/div[1]/span[1]"));
        Dashboard.click();
        Thread.sleep(2000);
        
        WebElement Usermanagement=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/a[2]/span[1]"));
        Usermanagement.click();
        Thread.sleep(2000);
        
        WebElement usermanagementstaff=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/a[3]/span"));
        usermanagementstaff.click();
        Thread.sleep(2000);
        
        WebElement Registrationpendingstaff=driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]"));
        Registrationpendingstaff.click();
        Thread.sleep(2000);
        
    
        WebElement Employeeid=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[4]/div[2]/div[2]/div[2]/div[1]/div/table/tbody/tr[1]/td[1]"));
        Employeeid.click();
        Thread.sleep(2000);
        
        WebElement edit=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div[6]/div/div[2]/button"));
        edit.click();
        
	}

}
