package testng;

import org.testng.annotations.Test;

public class Groups {

		
		@Test(groups = {"hdfcurl"})
		public  void hdfcbankurl() {
		System.out.println("hdffc url");
		}
	@Test(groups = {"sanity"})
		public void Enteremail() {
		System.out.println("email id");
		}
	@Test (groups = {"sanity"})
		public void Enterpassword() {
			System.out.println("password");
			}
	@Test (groups = {"reg"})
		public void Enterlogin() {
			System.out.println("login");
			
	}
           @Test (groups = {"reg"})
	       public void logout() {
		   System.out.println("logout");
			}
		
	}


