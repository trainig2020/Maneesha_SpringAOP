package com.spring;

import com.spring.service.FactoryService;
import com.spring.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {
		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("spring.xml");
		// ShapeService service = applicationContext.getBean("shapeService",
		// ShapeService.class);
		FactoryService factoryService = new FactoryService();
		ShapeService service = (ShapeService) factoryService.getBean("shapeService");

		service.getCircle(); // --> Around advice type

	}

}
