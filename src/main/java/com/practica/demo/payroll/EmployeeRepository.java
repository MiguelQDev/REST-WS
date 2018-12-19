package com.practica.demo.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    class OrderNotFoundException extends RuntimeException{

        OrderNotFoundException(Long id) {
            super("Could not find order " + id);
        }
    }
}
