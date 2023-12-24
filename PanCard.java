package GovtDocuments;

public class PanCard {
	private int panNo;
	private static PanCard p=null;
	
	private PanCard(int panNo) {
		this.panNo=panNo;
		panDetails();
	}
	
	public static PanCard panHelp(int panNo) {
		if(p==null) {
		p=new PanCard(panNo);
		System.out.println("Pan Card is Generated for the User.");
		}
	else
		System.out.println("Sorry, the User already has a Pan Card.");
	return p;
	}
	
	public void panDetails() {
		System.out.println("Pan Card NUmber : "+panNo);
	}
}
