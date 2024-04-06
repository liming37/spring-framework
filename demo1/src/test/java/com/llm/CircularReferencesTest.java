package com.llm;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularReferencesTest {

	@Test()
	public void testCircleBysetterAndPrototype() throws Throwable {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("service.xml");
			//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("testSingleton.xml");
			System.out.println(ctx.getBean("testA"));
		}catch (Exception e){
			Throwable cause = e.getCause().getCause().getCause();
			throw cause;

		}
	}
}
