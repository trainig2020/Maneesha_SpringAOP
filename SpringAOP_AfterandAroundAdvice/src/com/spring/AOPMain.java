package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service = applicationContext.getBean("shapeService", ShapeService.class);
		//System.out.println(service.getCircle().getName());
		//service.getCircle().setNameAndReturn("Duplicate name");
		
		//service.getCircle().setName("Duplicate name"); 
		
		service.getCircle(); //--> Around advice type

	}

}
