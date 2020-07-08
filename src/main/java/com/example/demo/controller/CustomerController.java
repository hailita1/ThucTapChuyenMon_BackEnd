package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Deal;
import com.example.demo.model.Host;
import com.example.demo.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@CrossOrigin("*")
@RestController
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerServicel;

    @RequestMapping(value = "/api/customers", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Customer>> listAllCustomer() {
        Iterable<Customer> customers = customerServicel.findAll();
        if (customers == null) {
            return new ResponseEntity<Iterable<Customer>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Iterable<Customer>>(customers, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/customers/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long id) {
        Customer customer = customerServicel.findById(id);
        if (customer == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/customers", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody Customer customer, UriComponentsBuilder ucBuilder) {
        customerServicel.save(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/customers/{id}").buildAndExpand(customer.getIdCustomer()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/customers/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer) {
        Customer customer1 = customerServicel.findById(id);

        if (customer1 == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        customer1.setDiaChi(customer.getDiaChi());
        customer1.setCmnd(customer.getCmnd());
        customer1.setDeals(customer.getDeals());
        customer1.setTen(customer.getTen());
        customer1.setHo(customer.getHo());
        customer1.setPassword(customer.getPassword());
        customer1.setUserName(customer.getUserName());
        customer1.setSdt(customer.getSdt());
        customer1.setAvt(customer.getAvt());
        customerServicel.save(customer1);
        return new ResponseEntity<Customer>(HttpStatus.OK);
    }

    @RequestMapping(value = "/api/customers/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Long id) {
        Customer customer = customerServicel.findById(id);
        if (customer == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        customerServicel.remove(id);
        return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
    }
}
