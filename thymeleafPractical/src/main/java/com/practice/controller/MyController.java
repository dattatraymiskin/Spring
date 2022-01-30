package com.practice.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {

		model.addAttribute("name", "Datta Miskin");
		model.addAttribute("currentDate", new Date().toLocaleString());
		System.out.println("Inside about Handler.......");
		return "about";
	}
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		List<String> list=new ArrayList<>();
		list.add("Datta");
		list.add("Dattatray");
		list.add("Pradip");
		list.add("Miskin");
		model.addAttribute("names",list);
		return "iterate";
	}
	
	@GetMapping("/condition")
	public String conditionalHandler(Model m) {
		System.out.println("conditional handler executed....");
		m.addAttribute("isActive",false);
		m.addAttribute("gender","M");
	//	List<Integer> list=List.of(12,46,45,50,5);
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(14);
		list.add(45);
		m.addAttribute("mylist", list);
		return "condition";
	}
	
	//including fragment
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		m.addAttribute("title", "I like to eat samosa");
		m.addAttribute("subtitle", LocalDateTime.now().toString());
		 return "service";
	}
	
	//for new about
	@GetMapping("/aboutview")
	public String newAbout() {
		
		return "aboutview";
	}
	
	@GetMapping("/contact")
	public String contact() {
		
		return "contact";
	}
}
 