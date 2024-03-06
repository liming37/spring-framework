package com.llm;


import com.llm.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext("com.llm.service");
		HelloService helloService = ac.getBean(HelloService.class);
		helloService.sayHello();
	}

}

