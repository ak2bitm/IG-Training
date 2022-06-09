package com.akhilesh.Optional.DataModelWithOptional;

public class Trainer {

	private String trainerName;
	private String trinerEmail;
	private String trainerContact;
	public Trainer(String trainerName, String trinerEmail, String trainerContact) {
		super();
		this.trainerName = trainerName;
		this.trinerEmail = trinerEmail;
		this.trainerContact = trainerContact;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrinerEmail() {
		return trinerEmail;
	}
	public void setTrinerEmail(String trinerEmail) {
		this.trinerEmail = trinerEmail;
	}
	public String getTrainerContact() {
		return trainerContact;
	}
	public void setTrainerContact(String trainerContact) {
		this.trainerContact = trainerContact;
	}
	@Override
	public String toString() {
		return "Trainer [trainerName=" + trainerName + ", trinerEmail=" + trinerEmail + ", trainerContact="
				+ trainerContact + "]";
	}
	
}
