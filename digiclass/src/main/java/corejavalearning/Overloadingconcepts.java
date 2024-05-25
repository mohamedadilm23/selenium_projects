package corejavalearning;



public class Overloadingconcepts {
	public static void main(String[] args) {

		 Overloadingconcepts yt=new  Overloadingconcepts();
		 yt.deletevideo("Adil video deleted successfully");
		 yt.deletevideo("Adil");
		 yt.youtubeshorts(2023);
		 yt.youtubestory(false);
	}
	      private void deletevideo(java.lang.String string) 
	      {
		  System.out.println("deleted video -" + string);
	 }

	      private void youtubeshorts(int a) 
	      {
		  System.out.println("print the number" + a);
	 }
	      private void youtubestory(boolean b) 
	      {
		  System.out.println(b=true);
	 }
	      
}
		//------>method with parameter
		 
	
		//public void Whatappstatus() {
			//System.out.println("send put on your status");
			//System.out.println(videoId);
		//	}
	//	}
	
