package com.bhavna.bean;

public class Department {
	private int id;
	private String name;
	private int noOfStaff;

	public Department() {
		super();
	}

	public Department(int id, String name, int noOfStaff) {
		super();
		this.id = id;
		this.name = name;
		this.noOfStaff = noOfStaff;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", noOfStaff=" + noOfStaff + "]";
	}

}
