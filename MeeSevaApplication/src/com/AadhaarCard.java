package com;

import java.util.Random;

public class AadhaarCard {
	private static AadhaarCard a=null;
	long aadhaarNo;
	Random r=new Random();
	private AadhaarCard() {
		this.aadhaarNo=r.nextLong(12345678911l);
		System.out.println("AadhaarNo: "+aadhaarNo);
	}
	public static AadhaarCard createAadhaarCardObj() {
		if(a==null) {
			a=new AadhaarCard();
			System.out.println("AadhaarCard is created successfully..");
		}
		else {
			System.out.println("Already AadhaarCard is created..");
		}
		return a;
	}
}
