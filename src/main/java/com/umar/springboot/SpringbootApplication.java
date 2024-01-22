package com.umar.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {

	@GetMapping("/get")
	public String insert()
	{
		return "hello,first run on docker";
	}
	
	@GetMapping("/leoleo")
	public String insert1()
	{
		return "leoleo bolte chota";
	}
	
	@GetMapping("/leo")
	public String insert2()
	{
		return "leoleo haula";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}

