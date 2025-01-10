package com.bankconsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bankconsumer.dto.Employee;

@RestController
@RequestMapping("/api/v1/consumers")
public class BankConsumerController {
	
	@Autowired
	private DiscoveryClient ds;
	
	@GetMapping
	public List<Employee> getAll(){
		
	List<ServiceInstance> ll=	ds.getInstances("BANKING");
	
	System.out.println(ll.size()+"  instances are running");
	
	ServiceInstance ss=  ll.get(0);
	
	String url=ss.getUri().toString();
	
	System.out.println(url);
		
		
		
		 RestTemplate rest=new RestTemplate();
		List<Employee> ll1= rest.getForObject(url+"/api/v1/employees", List.class);
		
		return ll1;
	}
	
}









