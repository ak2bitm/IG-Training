package com.akhilesh.Optional.DataModelWithoutOptional;

public class Trainer {

	private String trainerName;
	private String trainerEmail;
	private String trainerContact;
	public Trainer() {
		super();
	}
	public Trainer(String trainerName, String trainerEmail, String trainerContact) {
		super();
		this.trainerName = trainerName;
		this.trainerEmail = trainerEmail;
		this.trainerContact = trainerContact;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerEmail() {
		return trainerEmail;
	}
	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
	}
	public String getTrainerContact() {
		return trainerContact;
	}
	public void setTrainerContact(String trainerContact) {
		this.trainerContact = trainerContact;
	}
	@Override
	public String toString() {
		return "Trainer [trainerName=" + trainerName + ", trainerEmail=" + trainerEmail + ", trainerContact="
				+ trainerContact + "]";
	}
	
}
