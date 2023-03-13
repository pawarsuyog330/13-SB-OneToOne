package com.ashokit.jpa.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jpa.entities.CustomerEntity;
import com.ashokit.jpa.entities.LockerEntity;
import com.ashokit.jpa.repository.CustomerEntityRepository;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	CustomerEntityRepository customerRepo;
	
	@Override
	public void run(String... args) throws Exception {
		CustomerEntity cEntity=new CustomerEntity();
		//cEntity.setCustomerId(9921);
		cEntity.setCustomerName("Tanvi Pawar");
		
		LockerEntity lEntity=new LockerEntity();
		lEntity.setLockerId(1001);
		lEntity.setRent(1000.0);
		
		cEntity.setLocker(lEntity);
		
		customerRepo.save(cEntity);

	}

}
