package testng;
import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Depends {



		    @Test
		    public void loginTest() {
		        // Test logic for login
		    }

		    @Test(dependsOnMethods = "loginTest")
		    public void dashboardTest(){
		    	System.out.println("login test checks");
		    	throw new NoSuchElementException("dashboard");
		    	
		        // Test logc for dashboard, runs after loginTest
		    }

		    @Test(dependsOnMethods = {"loginTest", "dashboardTest"})
		    public void logoutTest() {
		        // Test logic for logout, runs after loginTest and dashboardTest
		    }
	

	
		
		
		
		
		
		
		
	}



