package com.tnsif.SpringBoot.Qualifier_Annotation;

import org.springframework.stereotype.Component;

@Component
public class MedicalShop implements Ordering{
	
	public void order()
	{
		System.out.println("Ordering Medical product...");
	}

}
