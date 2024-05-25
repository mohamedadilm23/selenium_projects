package corejavalearning;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI mybank=new RBI();
		mybank.Voterid();
		boolean office=mybank.aadharcard();
		System.out.println(office);
		System.out.println("AAdhar card is mandotry");
		mybank.loan();
		System.out.println(mybank.cashlimit);
	}

}
