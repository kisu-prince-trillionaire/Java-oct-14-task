//package com.bhavna.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.bhavna.bean.Department;
//import com.bhavna.dao.DepartmentDao;
//import com.bhavna.entity.DepartmentEntity;
//
//@Service
//public class DepartmentService {
//	@Autowired
//	private DepartmentDao dao;
//	
//	public String display() {
//		return "Message from dao";
//	}
//	
//	public Department getDepartment() {
//		Department dept = new Department(101,"HR",100);
//		return dept;
//	}
//	
//	public List<Department> getAllDepartment() {
//		Department dept1 = new Department(101,"HR",100);
//		Department dept2 = new Department(102,"DEV",400);
//		Department dept3 = new Department(103,"QA",200);
//		Department dept4 = new Department(104,"FINANCE",50);
//		
//		List<Department> list = new ArrayList<Department>();
//		list.add(dept1);
//		list.add(dept2);
//		list.add(dept3);
//		list.add(dept4);
//		
//		return list;
//
//	}
//	
//	public Department findDepartment() {
//		Department dept = new Department(101,"HR",100);
//		return dept;
//	}
//
//	public String addDepartment(Department department) {
//		DepartmentEntity departmentEntity = new DepartmentEntity();
//		
//		departmentEntity.setId(department.getId());
//		departmentEntity.setName(department.getName());
//		departmentEntity.setNoOfStaff(department.getNoOfStaff());
//		dao.save(departmentEntity);
//		return "Department Added Successfuly";
//	}
//}
