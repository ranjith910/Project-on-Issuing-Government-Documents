package GovtDocuments;

public class User {
	private  String name;;
	private int age;
	private long mobileNo;
	private char gender;
	private String location;
	private String fatherName;
	
	public User() {
		
	}

	public User(String name, int age, long mobileNo, char gender, String location, String fatherName) {
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.location = location;
		this.fatherName = fatherName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public void userDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Mobile Number : "+mobileNo);
		System.out.println("Gender : "+gender);
		System.out.println("Location : "+location);
		System.out.println("Father's Name : "+fatherName);
	}
	
	
}
