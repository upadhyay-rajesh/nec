package com.banking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.entity.Employee;

@Repository
public interface BankingDAOInterface extends JpaRepository<Employee, String> {

}
