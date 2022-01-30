package com.tutorial.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tutorial.model.Employee;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Employee emp=new Employee();
		emp.setName("Datta");
		emp.setMob("123456");
		
		model.addAttribute("myEmp", emp);
		
		return "home";
	}
	
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("EID", 1005);
		return "contact";
	}
	
	@ResponseBody
	@GetMapping("/emp/{id}")
	public String emp(@PathVariable("id") String id) {
		
		return "Your Employee : "+id;
	}
	
	@ResponseBody
	@GetMapping("/emp")
	public String emp2(@RequestParam("empId") String id) {
		
		return "Your Employee : "+id;
	}
	
	@GetMapping("/msgVariable")
	public String msgVar() {
		return "msg-variable";
	}
	
	
	@GetMapping("/condition")
	public String condition(Model model) {
		Employee emp=new Employee();
		emp.setName("Datta");
		emp.setMob("123456");
		emp.setSalary(30000.00);
		model.addAttribute("emp1", emp);
		
		return "condition";
	}
	
	@GetMapping("/switch")
	public String switchCase(Model model) {
		Employee emp=new Employee();
		emp.setName("Datta");
		emp.setMob("123456");
		emp.setSalary(30000.00);
		model.addAttribute("emp1", emp);
		
		return "switch";
	}
	
	@GetMapping("/looping")
	public String looping(Model model) {
		List<Employee> empList=Arrays.asList(
				new Employee("Datta", "789654123", 500000),
				new Employee("Pradip", "124563987", 40000),
				new Employee("Rahul", "4563210789", 45000));
		model.addAttribute("empList", empList);
		
		return "looping";
	}
	
}
