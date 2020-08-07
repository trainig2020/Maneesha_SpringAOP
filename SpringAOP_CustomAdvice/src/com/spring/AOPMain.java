package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service = applicationContext.getBean("shapeService", ShapeService.class);
		 
		
		service.getCircle(); //--> Around advice type

	}

}
