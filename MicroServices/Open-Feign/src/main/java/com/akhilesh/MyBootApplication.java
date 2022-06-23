package com.akhilesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.client.RestTemplate;

import com.akhilesh.dto.Post;
import com.akhilesh.openFeign.MyRestServiceProxy;

@SpringBootApplication
@EnableFeignClients
public class MyBootApplication implements CommandLineRunner{

	@Autowired
	MyRestServiceProxy myRestServiceProxy;
	
	public static void main(String[] args) {
		SpringApplication.run(MyBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------------------------Using Rest Template------------------------");
		//Using Rest Template
		RestTemplate restTemp = new RestTemplate();
		String endPoint = "https://jsonplaceholder.typicode.com/posts/100";
		Post mypost = restTemp.getForObject(endPoint, Post.class);
		System.out.println(mypost);
		System.out.println("-------------------------Using Feign-------------------------");
		//Using Feign 
		Post mypost1 = myRestServiceProxy.getPostById(1);
		System.out.println(mypost1);
	}

}
