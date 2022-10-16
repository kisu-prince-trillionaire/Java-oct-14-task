package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.bean.Department;
import com.bhavna.dao.DepartmentDaoImplements;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentDaoImplements dao;
	
	@RequestMapping("/display")
	public String display() {
		String message = dao.display();
		return "message";
	}
	
	@RequestMapping(value= "/addDepartment",method=RequestMethod.POST)
	public String addDepartment(@RequestBody Department department) {
		String message = dao.addDepartment(department);
		return message;
	}
	
	@RequestMapping(value = "/getDepartment", method = RequestMethod.GET)
	public Department getDepartment() {
		Department emp = dao.getDepartment();
		return emp;
	}
	
	@RequestMapping(value = "/getAllDepartment", method = RequestMethod.GET)
	public List<Department> getAllDepartment() {
		List<Department> list = dao.getAllDepartment();
		return list;
	}
	
	@PostMapping("/getDepartmentById/{id}")
	public Department getDepartmentById(@PathVariable("id") int id) {
		Department emp = dao.findDepartment();
		return emp;
	}
	

	@GetMapping
	public String getDisplay() {
		return "From Get Display";
	}
	
	@GetMapping("/getdisplay")
	public String testdisplay() {
		return "From test display";
	}
}
