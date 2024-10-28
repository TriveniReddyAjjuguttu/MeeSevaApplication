package com;

import java.util.Random;

public class VoterID {
	private static VoterID v=null;
	int voterID;
	Random r=new Random();
	private VoterID() {
		this.voterID=r.nextInt(12345);
		System.out.println("VoterId: "+voterID);
	}
	public static VoterID createVoterIDObj(Customer c) {
		if(c.getAge()>=18) {
			if(v==null) {
				v=new VoterID();
				System.out.println("VoterId is created successfully");
			}
			else {
				System.out.println("Already VoterID is created..");
			}
		}
		else {
			System.out.println("Not Eligible for voting..");
		}
		return v;
	}
}
