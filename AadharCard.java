package GovtDocuments;

public class AadharCard {
	private long aadharNo;
	private static AadharCard a=null;
	
	private AadharCard(long aadharNo) {
		this.aadharNo=aadharNo;
		aadharDetails();
	}
	
	public static AadharCard aadharHelp(long aadharNo) {
		if(a==null) {
			a=new AadharCard(aadharNo);
			System.out.println("Aadhar Card is Generated for the User.");
		}
		else
			System.out.println("Sorry, the User already has a Aadhar Card.");
		return a;
	}
	
	public void aadharDetails() {
		System.out.println("Aadhar Card Number : "+aadharNo);
	}
}
