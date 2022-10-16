package com.bhavna.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhavna.bean.Department;
import com.bhavna.entity.DepartmentEntity;

@Repository
public class DepartmentDaoImplements {
	@Autowired
	private DepartmentDao dao;
	
	public String display() {
		return "Message from dao";
	}
	
	public Department getDepartment() {
		Department dept = new Department(101,"HR",100);
		return dept;
	}
	
	public List<Department> getAllDepartment() {
		Department dept1 = new Department(101,"HR",100);
		Department dept2 = new Department(102,"DEV",400);
		Department dept3 = new Department(103,"QA",200);
		Department dept4 = new Department(104,"FINANCE",50);
		
		List<Department> list = new ArrayList<Department>();
		list.add(dept1);
		list.add(dept2);
		list.add(dept3);
		list.add(dept4);
		
		return list;

	}
	
	public Department findDepartment() {
		Department dept = new Department(101,"HR",100);
		return dept;
	}

	public String addDepartment(Department department) {
		DepartmentEntity departmentEntity = new DepartmentEntity();
		
		departmentEntity.setId(department.getId());
		departmentEntity.setName(department.getName());
		departmentEntity.setNoOfStaff(department.getNoOfStaff());
		dao.save(departmentEntity);
		return "Department Added Successfuly";
	}
	
	public Department updateEmployee(Department department) {
		DepartmentEntity departmentEntity = new DepartmentEntity();
		// Converted Bean to Entity

		java.util.Optional<DepartmentEntity> departmentEntity1 = dao.findById(department.getId());
		if (departmentEntity.isPrensent()) {
			departmentEntity = departmentEntity1.get();
			departmentEntity.setId(department.getId());
			departmentEntity.setName(department.getName());
			departmentEntity.setNoOfStaff(department.getNoOfStaff());
			dao.save(departmentEntity);

		} else {
			department = null;
		}
		return department;
	}

	public String deleteEmployee(int eId) {

		// Converted Bean to Entity
		dao.deleteById(eId);

		return "Deleted Successfully" + eId;
	}

	public Department getEmployeeByIdEmployee(int id) {// http://localhost:8080/test/display
		DepartmentEntity departmentEntity = null;
		Department department = new Department();
		java.util.Optional<DepartmentEntity> departmentEntity1 = dao.findById(id);
		if (departmentEntity.isPresent()) {
			departmentEntity.setId(department.getId());
			departmentEntity.setName(department.getName());
			departmentEntity.setNoOfStaff(department.getNoOfStaff());

		} else {
			department = null;
		}
		return department;
	}
	public List<Department> getAllEmployee(){
			Iterable<DepartmentEntity> itrable =dao.findAll();
			List<Department> list = new ArrayList<Department>();
			itrable.forEach(departmentEntity->{
				Department department = new Department();
				BeanUtils.copyProperties(departmentEntity, department);
				list.add(department);
			});
			return list;
		
	}
}
