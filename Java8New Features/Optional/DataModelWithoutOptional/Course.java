package com.akhilesh.Optional.DataModelWithoutOptional;

public class Course {

	private String courseName;
	private String courseDuration;
	private String courseFee;
	private Trainer trainer;
	public Course() {
		super();
	}
	public Course(String courseName, String courseDuration, String courseFee, Trainer trainer) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFee = courseFee;
		this.trainer = trainer;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseDuration=" + courseDuration + ", courseFee=" + courseFee
				+ ", trainer=" + trainer + "]";
	}
	
}
