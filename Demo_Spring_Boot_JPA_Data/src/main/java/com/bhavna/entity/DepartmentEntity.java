package com.bhavna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "DEPARTMENT")
public class DepartmentEntity {
	@Id
	@Column(name= "D_ID")
	private int id;
	@Column(name= "D_NAME")
	private String name;
	@Column(name= "D_STAFF")
	private int noOfStaff;

	public DepartmentEntity() {
		super();
	}

	public DepartmentEntity(int id, String name, int noOfStaff) {
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
