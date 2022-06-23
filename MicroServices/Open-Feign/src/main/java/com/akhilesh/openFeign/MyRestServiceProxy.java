package com.akhilesh.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.akhilesh.dto.Post;

@FeignClient(value = "myplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface MyRestServiceProxy {

	@GetMapping(value = "/posts/{postId}", produces = "application/json")
	public Post getPostById(@PathVariable int postId);
}
