package com.akhilesh.springbatch.batch;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.type.LocalDateTimeType;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.akhilesh.springbatch.model.UserModel;

@Component
public class Processor implements ItemProcessor<UserModel, UserModel>{

	private static final Map<String, String> DEPT_NAME = new HashMap<>();
	
	public Processor() {
		DEPT_NAME.put("1001", "Technology");
		DEPT_NAME.put("1002", "Operations");
		DEPT_NAME.put("1003", "Accounts");
	} 
	@Override
	public UserModel process(UserModel user) throws Exception {
		String deptCode = user.getDept();
		String dept = DEPT_NAME.get(deptCode);
		user.setDept(dept);
		user.setTime(LocalDateTime.now());
		System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
		return user;
	}

}
