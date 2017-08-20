package com.my.study.accountservices;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
interface CustomerAccountRepositary extends JpaRepository<Customerdata, Long>{
	 
	@RestResource(path = "by-accountNumber")
	List<Customerdata> findByaccountName(@Param("accountNumber") String accountNumber);
	
}
