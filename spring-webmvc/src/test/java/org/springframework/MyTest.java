package org.springframework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class MyTest {
	@Test
	public void mytest() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println(applicationContext.getApplicationName());
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}

	public static class Person {

	}

	@Configuration
	public static class MyConfig{
		@Bean
		public Person getPerson(){
			return new Person();
		}
	}
}
