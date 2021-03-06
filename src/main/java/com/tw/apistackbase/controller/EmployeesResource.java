package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.model.EmployeeDB;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.logging.*;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/employees")
public class EmployeesResource {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> list(){
        return EmployeeDB.list();
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee){
        return EmployeeDB.create(employee);
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public Employee update(@PathVariable int id, @RequestBody Employee employee){
        return EmployeeDB.update(id, employee);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public Employee delete(@PathVariable int id){
        return EmployeeDB.delete(id);
    }


}
