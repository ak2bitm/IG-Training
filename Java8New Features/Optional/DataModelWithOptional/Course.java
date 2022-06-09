package com.akhilesh.Optional.DataModelWithOptional;

import java.util.Optional;

public class Course {

	private String courseName;
	private String courseFee;
	private String courseDuration;
	private Optional<Trainer> trainer;
	
	public Course() {
		super();
	}
	public Course(String courseName, String courseFee, String courseDuration, Optional<Trainer> trainer) {
		super();
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.courseDuration = courseDuration;
		this.trainer = trainer;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public Optional<Trainer> getTrainer() {
		return trainer;
	}
	public void setTrainer(Optional<Trainer> trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseFee=" + courseFee + ", courseDuration=" + courseDuration
				+ ", trainer=" + trainer + "]";
	}
	
}
