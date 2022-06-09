package com.akhilesh.Optional.DataModelWithOptional;

import java.util.Optional;

public class MainTest01 {

	public static void main(String[] args) {
		Trainer trainer = new Trainer("sri", "sri@gmail.com", "654123");
		Course course = new Course("Spring Boot", "25000.0", "3 Month", Optional.ofNullable(trainer));
		Student student = new Student("Shyam", "shyam@gmail.com", "253641", Optional.ofNullable(course));
		Optional<Student> stu = Optional.ofNullable(student);
		Optional<Course> cou = stu.flatMap(myst->myst.getCourse());
		Optional<Trainer> mytr = cou.flatMap(mycou->mycou.getTrainer());
		
		Optional<String> tName = mytr.map(mytra->mytra.getTrainerName());
		Optional<String> tEmail = mytr.map(mytra->mytra.getTrinerEmail());
		Optional<String> tPhon = mytr.map(mytra->mytra.getTrainerContact());
		System.out.println(tName);
		System.out.println(tEmail);
		System.out.println(tPhon);
		System.out.println("---------------OR---------------");
		String tname = tName.orElse("No Name Available");
		String temail = tEmail.orElse("No Email Available");
		String tphon = tPhon.orElse("No Phone Available");
		System.out.println(tname);
		System.out.println(temail);
		System.out.println(tphon);
	}
}
