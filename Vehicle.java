package GovtDocuments;

import java.util.Random;

public class Vehicle {
	private String brand;
	private String color;
	private int noOfWheels;
	private int chasiNo;
	private boolean vehicleStatus;
	
	public Vehicle(String brand, String color, int noOfWheels, int chasiNo, boolean vehicleStatus) {
		this.brand = brand;
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.chasiNo = chasiNo;
		this.vehicleStatus = vehicleStatus;
		hasVehicle();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public int getChasiNo() {
		return chasiNo;
	}
	public void setChasiNo(int chasiNo) {
		this.chasiNo = chasiNo;
	}
	public boolean isVehicleStatus() {
		return vehicleStatus;
	}
	public void setVehicleStatus(boolean vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	
	public void hasVehicle() {
		if(vehicleStatus==true) {
			Random var=new Random();
			long num=var.nextLong(123456789, 987654321);
			DrivingLicense.dlHelp(num, vehicleStatus);
		}
		else
			System.out.println("The user dosen't have a vehicle.");
			
	}
	
}
