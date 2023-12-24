package GovtDocuments;

import java.util.Random;
import java.util.Scanner;

public class DocumentDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		System.out.println("enter user name");
		String name=sc.next();
		System.out.println("enter user age");
		int age=sc.nextInt();
		System.out.println("enter user Mobile Number");
		long mobileNo=sc.nextLong();
		System.out.println("enter user Gender");
		char gender=sc.next().charAt(0);
		System.out.println("enter user location");
		String location=sc.next();
		System.out.println("enter user's Father Name");
		String fatherName=sc.next();
		User u=new User(name,age,mobileNo,gender,location,fatherName);
		boolean status=true;
		while(status) {
			System.out.println("Enter your Choice :\n"
					+ "1.Aadhar Card\n"
					+ "2.Pan Card\n"
					+ "3.Voter Id\n"
					+ "4.Driver's License\n"
					+ "5.Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				AadharCard.aadharHelp(r.nextLong(12345678, 98746321));
				u.userDetails();
			}
			break;
			case 2:{
				PanCard.panHelp(r.nextInt(123456, 987456));
				u.userDetails();
			}
			break;
			case 3:{
				VoterId.voterHelp(r.nextInt(), age);
				u.userDetails();
			}
			break;
			case 4:{
				System.out.println("enter vehicle brand");
				String brand=sc.next();
				System.out.println("enter vehicle color");
				String color=sc.next();
				System.out.println("enter number of wheels of your vehicle");
				int noOfWheels=sc.nextInt();
				System.out.println("enter Chassi Number of your vehicle");
				int chassiNo=sc.nextInt();
				System.out.println("enter true if the vehicle is present, else enter false");
				boolean vehicleStatus=sc.nextBoolean();
				Vehicle vehicle=new Vehicle(brand,color,noOfWheels,chassiNo,vehicleStatus);
			}
			break;
			case 5:
				status=false;
				break;
			default :
				System.out.println("Enter Valid Choice");
			}
		}
	}
}
