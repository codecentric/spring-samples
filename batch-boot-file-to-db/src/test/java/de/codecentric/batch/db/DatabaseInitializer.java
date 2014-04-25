package de.codecentric.batch.db;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseInitializer {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:initialize-database-context.xml");
		applicationContext.close();
	}

}
