package utilies;

import org.testng.annotations.DataProvider;

public class Datautilies {

		@DataProvider(name="kowshikloginpage",indices = {1,2})
		public String[][] getdata() {
			String[][] data=new String[3][2];
			data[0][0]="md.mohamedadil@mail.com";
			data[0][1]="12345678";
			
			data[1][0]="fayas@mail.com";
			data[1][1]="12345678a";
			
			data[2][0]="jaleel@mail.com";
			data[2][1]="12345678a";
			
			
			
			
				return data; 	
		}
	}


