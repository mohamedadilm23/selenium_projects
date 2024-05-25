package corejavalearning;

public class Staticvariable {

	//static variable is calling as whole class but instance means(nonstatic varaiable)as declarere as only objects
	
	int x=0;
	static int y=0;
	 
	void adil(){
		x++;
		y++;
		System.out.println("non-static=>"+x+"static=>"+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvariable ds=new Staticvariable();
		ds.adil();
		ds.adil();
		System.out.println("Once again calling you adil");
		Staticvariable ls1=new Staticvariable();
		ls1.adil();
		ls1.adil();
		System.out.println("Once again calling new adil bro");
		Staticvariable ls3=new Staticvariable();
		ls3.adil();
		ls3.adil();


}
}