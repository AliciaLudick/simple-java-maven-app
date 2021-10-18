package com.za.simplejavamavenapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class SimpleJavaMavenAppApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(SimpleJavaMavenAppApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SimpleJavaMavenAppApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World! =D";
	}
}
