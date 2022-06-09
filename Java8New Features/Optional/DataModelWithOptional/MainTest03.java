package com.akhilesh.Optional.DataModelWithOptional;

import java.util.Optional;

public class MainTest03 {

	public static void main(String[] args) {
		Trainer trainer = null;
		Course course = new Course("Spring Boot", "25000.0", "3 Month", Optional.ofNullable(trainer));
		Student student = new Student("Shyam", "shyam@gmail.com", "253641", Optional.ofNullable(course));
		
		Optional<Student> stu = Optional.ofNullable(student);
		
		String tName = 	stu.flatMap(
				mystu->mystu.getCourse()
				.flatMap(mycou->mycou.getTrainer().map(mytr->mytr.getTrainerName()))
				).orElse("No Name Found");
		System.out.println(tName);
		String tEmail = stu.flatMap(
				mystu->mystu.getCourse().flatMap(
						mycou->mycou.getTrainer().map(
						mytr->mytr.getTrinerEmail()))
				).orElse("No Email Found");
		System.out.println(tEmail);
		String tPhone = stu.flatMap(
				myst->myst.getCourse().flatMap(
				mycou->mycou.getTrainer().map(
				mytr->mytr.getTrainerContact()))
				).orElse("No Phone Found");
		System.out.println(tPhone);
	}
}
