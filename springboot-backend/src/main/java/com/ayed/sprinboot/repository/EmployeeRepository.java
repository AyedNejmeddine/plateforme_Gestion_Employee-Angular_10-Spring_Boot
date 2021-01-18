package com.ayed.sprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayed.sprinboot.modele.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
