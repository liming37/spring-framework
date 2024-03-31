package com.llm;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularReferencesTest {

	@Test()
	public void testCircleBysetterAndPrototype() throws Throwable {
		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("testPrototype.xml");
			//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("testSingleton.xml");
			System.out.println(ctx.getBean("testA"));
		}catch (Exception e){
			Throwable cause = e.getCause().getCause().getCause();
			throw cause;

		}
	}
}
