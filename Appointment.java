package HealthCare;

import java.util.Date;

public class Appointment {
	private Date dateTime;
	private Patient patient;
	private Doctor doc;
	
	public Appointment(Patient p,Doctor d,Date date) {
		this.patient = p;
		this.doc = d;
		this.dateTime = date;
		
	}
	
	

}
