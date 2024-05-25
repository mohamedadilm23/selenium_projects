package corejavalearning;
import java.util.*;

public class Constructorparameter {

	int y1;
	java.lang.String name1;
    float f1;
	

     	
	public Constructorparameter(int y, java.lang.String string, float f) {
		this.f1 = f;
		this.name1 = string;
		this.y1 = y;
	}



	void dispaly() {
		String i;
		System.out.println(y1+"--->"+name1+f1);
	
	 }
	
	public static void main(String[] args) {

		Constructorparameter ls =new Constructorparameter(100,"mohamed adil",20f);
		ls.dispaly();
	}
	
	
	
	
}
