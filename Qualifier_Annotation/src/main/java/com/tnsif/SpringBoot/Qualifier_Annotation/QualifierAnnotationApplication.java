package com.tnsif.SpringBoot.Qualifier_Annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QualifierAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(QualifierAnnotationApplication.class, args);
		Customer c = var.getBean(Customer.class);
		c.order();
	}

}
