package com;

import java.util.Scanner;

public class MeeSevaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean start=true;
		while(true) {
			System.out.println("Enter choice: \n 1. AadhaarCard \n 2. PanCard \n 3. VoterID \n 4. Exit \n");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				AadhaarCard.createAadhaarCardObj();
			}
			break;
			case 2:{
				System.out.println("Enter Customer name:");
				String name=sc.next();
				System.out.println("Enter Customer age:");
				int age=sc.nextInt();
				System.out.println("Enter Customer mobileNo:");
				long mobileNo=sc.nextLong();
				System.out.println("Enter Customer address:");
				String address=sc.next();
				System.out.println("Enter Customer fatherName:");
				String fatherName=sc.next();
				PanCard.createPanCardObj(new Customer(name,age,mobileNo,address,fatherName));
			}
			break;
			case 3:{
				System.out.println("Enter Customer name:");
				String name=sc.next();
				System.out.println("Enter Customer age:");
				int age=sc.nextInt();
				System.out.println("Enter Customer mobileNo:");
				long mobileNo=sc.nextLong();
				System.out.println("Enter Customer address:");
				String address=sc.next();
				System.out.println("Enter Customer fatherName:");
				String fatherName=sc.next();
				VoterID.createVoterIDObj(new Customer(name,age,mobileNo,address,fatherName));
			}
			break;
			case 4:{
				System.out.println("Thank you for visting MeeSeva Application");
				System.exit(0);
			}
			break;
			default: {
				System.out.println("Invalid choice..");
			}
			}
		}

	}

}
