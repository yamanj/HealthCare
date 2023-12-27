package HealthCare;
import java.util.ArrayList;

public class Doctor {
	private String name;
	private MedicalSpecialty specialty;
	
	
	public Doctor(String name,MedicalSpecialty specialty) {
		this.name = name;
		this.specialty = specialty;
	} 
	
	public MedicalSpecialty getSpecialty() {
		return specialty;
	}

	
}
