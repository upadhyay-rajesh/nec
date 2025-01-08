package com.banking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.Employee;
import com.banking.service.BankingServiceInterface;

@RestController
@RequestMapping("/api/employees")
public class BankingController {
	
	@Autowired
	private BankingServiceInterface bService;
	
	
	@GetMapping
	public List<Employee> getAll(){
		
		return bService.getAllRecordService();
	}
	
	@PostMapping
	public Employee create(@RequestBody Employee ee) {
		bService.createEmployeeRecordService(ee);  
		return ee;
	}
	
	@PutMapping("/{empid}")
	
	public Employee editEmployee(@PathVariable("empid") String email,@RequestBody Employee ee) {
		ee.setEmail(email);
		
		bService.editEmployeeService(ee);
		return ee;
	}
	
	@DeleteMapping("/{empid}")
	public String delete(@PathVariable("empid") String email) {
		bService.deleteEmployeeService(email);
		return email+"   Employee record deleted";
	}

}





























