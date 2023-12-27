
package HealthCare;
import java.util.ArrayList;
import java.util.Date;

public class Clinic {
	private String name ;
	private String address;
	private String phone_number;
	private ArrayList <Patient> patients= new ArrayList <Patient>();
	
	
	public Clinic(String name,String address,String phone) {
		this.name = name;
		this.address=address;
		this.phone_number = phone;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public String getPhoneNumber() {
		return phone_number;
	}

	
	public ArrayList<Patient> getPatientList(){
		return this.patients;
	}
	
	public void addPatient(Patient p) {
		patients.add(p);
	}
	
	

}
