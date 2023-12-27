package HealthCare;

import java.util.ArrayList;
import java.util.Date;

//import java.util.ArrayList;

public class Patient {
	private String name;
	private int age;
	private String address;
	private String phone;
	private String diseases;
	private ArrayList <Appointment> appointments= new ArrayList <Appointment>();

	//private ArrayList<Disease> diseases=new ArrayList<Disease>();
	
	public Patient (String name,int age,String address,String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		
	}
	
	public Patient(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void addAddress(String addr) {
		this.address = addr;
	}
	
	public void addPhone(String phone) {
		this.phone =  phone;
	}
	
	public String getDiseases (){
		return diseases;
	}
	
	public void addDisease(String disDescrp) {
		this.diseases = disDescrp;
	}
	
	public ArrayList getAppointmentList(){
		return this.appointments;
	}
	
	public void makeNewAppointment(Date dateTime) {
		Appointment appt = new Appointment(dateTime);
		this.appointments.add(appt);
	} 
	

}
