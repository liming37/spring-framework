package com.llm;

import com.llm.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class HelloWorlTest {

	@Test
	public void testSinpleXmlBeanLoad(){
		//XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("service.xml"));
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new FileSystemResource("/Users/llming/Documents/study/code/spring-framework/demo1/src/main/resources/service.xml"));
		HelloService helloService = (HelloService)xmlBeanFactory.getBean("helloService");

		helloService.sayHello();

	}
}
