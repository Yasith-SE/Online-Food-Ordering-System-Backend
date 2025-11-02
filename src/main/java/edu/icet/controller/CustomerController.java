package edu.icet.controller;

import edu.icet.model.dto.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("customer")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @GetMapping("/getAll")
    public List<Customer> customers(){
        return customerService.cusList();

    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable String id){
        return customerService.customerDeleteById(id);
    }

    @PutMapping("/update/{bookId}")
    public CustomerEntity update(@PathVariable String custId, @RequestBody CustomerEntity update){

        return customerService.update(custId,update);
    }


    @GetMapping("get/{id}")
    public Customer customerEntitySearch(@PathVariable String id){
        return customerService.customerEntitySearch(id);
    }

}
