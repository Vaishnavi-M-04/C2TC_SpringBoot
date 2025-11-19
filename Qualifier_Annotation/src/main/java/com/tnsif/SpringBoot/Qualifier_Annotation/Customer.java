package com.tnsif.SpringBoot.Qualifier_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private int cid;
	private String cname;
	
	@Autowired
	@Qualifier("grocery")
	private Ordering ordering;
	
	public void order()
	{
		ordering.order();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
