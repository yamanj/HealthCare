package HealthCare;

import java.util.Date;

public class Appointment {
	private Date dateTime;
	private Patient patient;
	
	
	public Appointment(Patient p,Date date) {
		this.patient = p;
		this.dateTime = date;
		
	}
	
	public Appointment (Date  date) {
		
		this.dateTime = date;
	}

}
