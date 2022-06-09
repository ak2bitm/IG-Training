package com.akhilesh.Optional.DataModelWithoutOptional;

public class MainTest01 {

	public static void main(String[] args) {
		Trainer t1 = new Trainer("Sri", "sri@gmail.com", "123456");
		Course c1 = new Course("Spring", "3 Month", "20000.0", t1);
		Student s1 = new Student("ram", "ram@gmail.com", "564123", c1);
		String tName="";
		String tEmail="";
		String tContact="";
		if(s1 !=null) {
			Course mycourse = s1.getCourse();
			if(mycourse !=null) {
				Trainer mytrainer = mycourse.getTrainer();
				if(mytrainer != null) {
					tName= mytrainer.getTrainerName();
					tEmail=mytrainer.getTrainerEmail();
					tContact=mytrainer.getTrainerContact();
				}
			}
		}
		System.out.println(tName);
		System.out.println(tEmail);
		System.out.println(tContact);
	}
}
