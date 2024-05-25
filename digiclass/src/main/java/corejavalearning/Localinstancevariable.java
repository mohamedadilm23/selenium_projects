package corejavalearning;

public class Localinstancevariable {

	
	int c;  //instance variable
	int d;
	//defaultmethod
     void addnumbers(int a,int b)
	{
		//int c=60;
		//int d=60;        //local variable
		System.out.println(a+b+ this.c);
		//System.out.println(d);
	
	}
	public static void main(String[] args) {
		Localinstancevariable Ad=new Localinstancevariable();
				Ad.addnumbers(10,20);
	}
}