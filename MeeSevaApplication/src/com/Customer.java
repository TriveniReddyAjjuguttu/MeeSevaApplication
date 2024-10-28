package com;

public class Customer {
	private String name;
	private int age;
	private long mobileNo;
	private String address;
	private String fatherName;
	
	public Customer() {
	}

	public Customer(String name, int age, long mobileNo, String address, String fatherName) {
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.address = address;
		this.fatherName = fatherName;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", fatherName=" + fatherName + "]";
	}
	public void display() {
		System.out.println("Customer name:"+getName());
		System.out.println("Customer age:"+getAge());
		System.out.println("Customer mobileNo:"+getMobileNo());
		System.out.println("Customer address:"+getAddress());
		System.out.println("Customer fatherName:"+getFatherName());
	}
	
}
