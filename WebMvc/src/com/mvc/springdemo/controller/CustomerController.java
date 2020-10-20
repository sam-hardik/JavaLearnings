package com.mvc.springdemo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.springdemo.entity.Customer;
import com.mvc.springdemo.service.CustomerService;



@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomer(Model model) {
	
	List<Customer> theCustomers = customerService.getCustomers();	
	model.addAttribute("customers", theCustomers);	
		return "list-customers";
	}
	
	
	
	@GetMapping("showFormForAdd")
	public String showFormForAdd(Model model) {
		Customer theCustomer = new Customer();
		model.addAttribute("customer" , theCustomer);
		
		return "customer-form";
	}
	
	@GetMapping("/orderByFirstName")
	public String orderByFirstName(Model model) {
		List<Customer> theCustomers = customerService.getCustomers();	
		Collections.sort(theCustomers, Customer.cusNameComparator);
		model.addAttribute("customers", theCustomers);	
			return "list-customers";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId , Model model  ) {
		Customer customer  = customerService.getCustomers(theId);
		
		model.addAttribute("customer" , customer);
		return "customer-form";
	}
	
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		
		customerService.deleteCustomer(theId);
		
		return "redirect:/customer/list";
	}
	
	
}
