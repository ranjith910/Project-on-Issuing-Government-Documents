package GovtDocuments;

public class DrivingLicense{
	private long dlNumber;
	private static DrivingLicense d=null;
	
	private DrivingLicense(long dlNumber) {
		this.dlNumber=dlNumber;
		dlDetails();
	}
	
	public static DrivingLicense dlHelp(long dlNumber,boolean vehicleStatus) {
		if(d==null && vehicleStatus==true) {
			d=new DrivingLicense(dlNumber);
			System.out.println("Driver's License is Generated for the User.");
		}
		else
			System.out.println("Sorry, the user already has a Driver's License.");
		return d;
	}
	
	public void dlDetails() {
		System.out.println("Driver's License Number is : "+dlNumber);
	}
}
