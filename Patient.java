package HealthCare;

import java.util.ArrayList;
import java.util.Date;

//import java.util.ArrayList;

public class Patient {
	private String firstname;
	private String lastname;
	private int age;
	private String address;
	private String city;
	private String state;
	private String phone;
	private ArrayList <Appointment> appointments= new ArrayList <Appointment>();

	
	public Patient (String fname,String lname,int age,String address,String city,String state,String phone) {
		this.firstname = fname;
		this.lastname = lname;
		this.age = age;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phone = phone;
		
	}
	
	public Patient(String fname,String lname,int age) {
		this.firstname = fname;
		this.lastname = lname;
		this.age = age;
	}
	
	public void addAddress(String addr,String city,String state) {
		this.address = addr;
		this.city = city;
		this.state = state;
	}
	
	public void addPhone(String phone) {
		this.phone =  phone;
	}
	
	
	public ArrayList getAppointmentList(){
		return this.appointments;
	}
	
	public void makeNewAppointment(Date dateTime) {
		Appointment appt = new Appointment(dateTime);
		this.appointments.add(appt);
	} 
	

}
