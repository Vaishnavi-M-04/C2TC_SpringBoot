package com.tnsif.SpringBoot.Qualifier_Annotation;

import org.springframework.stereotype.Component;

@Component
public class Grocery implements Ordering {
	
	public void order()
	{
		System.out.println("Ordering grocery products.... "
				+ "1. TURMERIC 2. GHEEEE ");
	}

}
