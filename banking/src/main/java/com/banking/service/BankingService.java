package com.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banking.dao.BankingDAOInterface;
import com.banking.entity.Employee;

@Service
@Transactional
public class BankingService implements BankingServiceInterface{
	
	@Autowired
	private BankingDAOInterface bDao;
	

	@Override
	public void createEmployeeRecordService(Employee ee) {
		bDao.save(ee);
		
	}


	@Override
	public List<Employee> getAllRecordService() {
		// TODO Auto-generated method stub
		return bDao.findAll();
	}


	@Override
	public Employee editEmployeeService(Employee ee) {
		bDao.saveAndFlush(ee);
		return ee;
		
	}


	@Override
	public void deleteEmployeeService(String email) {
		bDao.deleteById(email);
		
	}

}




















