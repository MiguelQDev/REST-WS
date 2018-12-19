package com.practica.demo.order;



import com.practica.demo.payroll.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class OrderNotFoundAdvice {


    @ResponseBody
    @ExceptionHandler(EmployeeRepository.OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String orderNotFoundHandler(EmployeeRepository.OrderNotFoundException ex) {
        return ex.getMessage();
    }

}
