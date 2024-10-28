package com;

import java.util.Random;

public class PanCard {
	private static PanCard p=null;
	int panCardNo;
	Random r=new Random();
	private PanCard() {
		this.panCardNo=r.nextInt(123456);
		System.out.println("PanCardNo: "+panCardNo);
	}
	public static PanCard createPanCardObj(Customer c) {
		if(c.getFatherName().equalsIgnoreCase("Ram")) {
			if(p==null) {
				p=new PanCard();
				System.out.println("PanCard is created successfully..");
			}
			else {
				System.out.println("Already pancard is created..");
			}
		}
		else {
			System.out.println("Father name mismatch..");
		}
		return p;
	}
}
