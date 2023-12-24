package GovtDocuments;

public class VoterId {
	private int voterId;
	private static VoterId v=null;
	
	private VoterId(int voterId) {
		this.voterId=voterId;
		voterIdDetails();
	}
	
	public static VoterId voterHelp(int voterId,int age) {
		if(v==null && age>=18) {
			v=new VoterId(voterId);
			System.out.println("Voter Id is Generated for the User.");
		}
		else
			System.out.println("Sorry, the User already has a Voter Id.");
		return v;
	}
	
	public void voterIdDetails() {
		System.out.println("Voter Id Number : "+voterId);
	}
}
