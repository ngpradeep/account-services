package com.my.study.accountservices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;




@Component
public class customerAccountCLR implements CommandLineRunner{
	
	private CustomerAccountRepositary customerAccountRepositary; 
	
	@Autowired
	public customerAccountCLR (CustomerAccountRepositary customerAccountRepositary){
		this.customerAccountRepositary = customerAccountRepositary;
	}
	
	@Override
	public void run(String... strings) throws Exception {
		
		List<Customerdata> customer = new ArrayList<>(Arrays.asList(new Customerdata("pradeep",new Long("2000")),new Customerdata("Ravi",new Long("5000")),new Customerdata("Rahul",new Long("6000"))));
		
		customer.stream().
				forEach( Customerdata -> customerAccountRepositary.save(Customerdata));

		customerAccountRepositary.findAll().forEach(System.out::println);
	}
	
}