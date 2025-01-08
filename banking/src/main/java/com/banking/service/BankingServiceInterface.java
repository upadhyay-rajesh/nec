package com.banking.service;

import java.util.List;

import com.banking.entity.Employee;

public interface BankingServiceInterface {

	void createEmployeeRecordService(Employee ee);

	List<Employee> getAllRecordService();

	Employee editEmployeeService(Employee ee);

	void deleteEmployeeService(String email);

}
