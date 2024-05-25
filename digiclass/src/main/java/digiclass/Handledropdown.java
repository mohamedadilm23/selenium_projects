package digiclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledropdown {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\digiclass\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("https://letcode.in/dropdowns");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    WebElement fruits=driver.findElement(By.id("fruits"));
		    Select myapple=new Select(fruits);
		    myapple.selectByVisibleText("Apple");
		    System.out.println(myapple.isMultiple());
		    
		    WebElement mynation= driver.findElement(By.id("country"));
		    Select mycountry=new Select(mynation);
		    mycountry.selectByValue("India");
		    WebElement cities= mycountry.getFirstSelectedOption();
     	    System.out.println(cities.getText());
		    
		    WebElement hero=driver.findElement(By.id("superheros"));
            Select myheros=new Select(hero);
            boolean Actionheros= myheros.isMultiple();
            System.out.println("See actions heros adil"+Actionheros);
            myheros.selectByIndex(0);
            myheros.deselectByIndex(1);
            myheros.selectByValue("bw");
            myheros.selectByValue("ta");
            driver.close();
        
		    
		    
	}

}
